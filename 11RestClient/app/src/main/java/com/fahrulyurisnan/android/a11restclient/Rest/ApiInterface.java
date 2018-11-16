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

public interface ApiInterface {
    @GET("pembelian/transaksi")
    Call<GetPembelian> getPembelian();

    @FormUrlEncoded
    @POST("pembelian/transaksi")
    Call<PostPutDelPembelian> postPembelian
            (@Field("id_pembelian") String idPembelian, @Field("id_pembeli") String idPembeli,
             @Field("tanggal_beli") String tanggalBeli, @Field("total_harga") String totalHarga,
             @Field("id_tiket") String idTiket);

    @FormUrlEncoded
    @PUT("pembelian/transaksi")
    Call<PostPutDelPembelian> putPembelian(
            @Field("id_pembelian") String idPembelian, @Field("id_pembeli") String idPembeli,
            @Field("tanggal_beli") String tanggalBeli, @Field("total_harga") String totalHarga,
            @Field("id_tiket") String idTiket);

    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "pembelian/transaksi", hasBody = true)
    Call<PostPutDelPembelian> deletePembelian(@Field("id_pembelian") String idPembelian);
}
