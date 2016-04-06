package edu.jacc.expensemanager.client.retrofit;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ExpenseManagerService {
	@GET("expensemanager")
	Call<ResponseBody> getStatus();
}
