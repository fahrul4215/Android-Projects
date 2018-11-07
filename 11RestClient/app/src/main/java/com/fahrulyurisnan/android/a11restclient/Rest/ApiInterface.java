package com.fahrulyurisnan.android.a11restclient.Rest;

import com.fahrulyurisnan.android.a11restclient.Model.GetPembelian;
import com.fahrulyurisnan.android.a11restclient.Model.PostPutDelPembelian;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public class ApiInterface {
    @GET("pembelian/user")
    Call<GetPembelian> getPembelian() {
        return null;
    }

    @FormUrlEncoded
    @POST("pembelian/user")
    Call<PostPutDelPembelian> postPembelian
            (@Field("id_pembelian") String idPembelian, @Field("id_pembeli") String idPembeli,
             @Field("tanggal_beli") String tanggalBeli, @Field("total_harga") String totalHarga,
             @Field("id_tiket") String idTiket) {
        return null;
    }

    @FormUrlEncoded
    @PUT("pembelian/user")
    Call<PostPutDelPembelian> putPembelian(
            @Field("id_pembelian") String idPembelian, @Field("id_pembeli") String idPembeli,
            @Field("tanggal_beli") String tanggalBeli, @Field("total_harga") String totalHarga,
            @Field("id_tiket") String idTiket) {
        return null;
    }

    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "pembelian/user", hasBody = true)
    Call<PostPutDelPembelian> deletePembelian(@Field("id_pembelian") String idPembelian) {
        return null;
    }
}
