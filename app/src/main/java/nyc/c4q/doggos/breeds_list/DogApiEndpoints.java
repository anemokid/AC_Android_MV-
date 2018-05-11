package nyc.c4q.doggos.breeds_list;

import android.support.annotation.NonNull;

import nyc.c4q.doggos.doggos_list.ImagesByBreedResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface DogApiEndpoints {

    String BASE_URL = "https://dog.ceo/api/";

    @GET("breeds/list")
    Call<BreedsListResponse> getBreedsList();

    @GET("breed/{breed_name}/images")
    Call<ImagesByBreedResponse> getImages(@Path("breed_name") @NonNull String breedName);
}
