package edu.jacc.expensemanager.client.retrofit;

import java.util.List;

import edu.jacc.expensemanager.entities.Category;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ExpenseManagerCategoryService {

	@GET("expensemanager/categories/list")
	Call<List<Category>> getCategories();

	@POST("expensemanager/categories")
	Call<Category> createUser(@Body Category category);
}
