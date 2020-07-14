package kz.alamyn.databindingrecyclerview;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EmployeeDataService {
    @GET("users/?per_page=12&page=1")
    Call<EmployeeDBResponse> getEmployees();
}
