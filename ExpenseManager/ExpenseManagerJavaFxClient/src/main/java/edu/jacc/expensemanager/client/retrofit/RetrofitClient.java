package edu.jacc.expensemanager.client.retrofit;

import java.io.IOException;
import java.util.List;

import edu.jacc.expensemanager.client.AppProperties;
import edu.jacc.expensemanager.entities.Category;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;

public class RetrofitClient {

	final private Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
			.baseUrl(AppProperties.getString("app.urltarget")).build();

	public ExpenseManagerService getExpenseManagerService() {
		return retrofit.create(ExpenseManagerService.class);
	}

	public ExpenseManagerCategoryService getExpenseManagerCategoryService() {
		return retrofit.create(ExpenseManagerCategoryService.class);
	}

	public String getStatus() {
		Call<ResponseBody> call = new RetrofitClient().getExpenseManagerService().getStatus();
		try {
			ResponseBody response = call.execute().body();
			return response.string();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
	}

	public List<Category> getCategories() {
		Call<List<Category>> call = new RetrofitClient().getExpenseManagerCategoryService().getCategories();
		try {
			List<Category> categories = call.execute().body();
			return categories;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public boolean saveCategory(Category category) {
		Call<Category> call = new RetrofitClient().getExpenseManagerCategoryService().createUser(category);
		try {
			Response<Category> response = call.execute();
			response.message();
			return response.isSuccess();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
