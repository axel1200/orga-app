package org.group_orga.grouporgaapp.api;

import org.group_orga.grouporgaapp.api.data.Account;
import org.group_orga.grouporgaapp.api.data.GroupOfUsers;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OrgaAPITemplate {
    @GET("version")
    Call<String> getVersion();

    @GET("me")
    Call<Account> getMe();

    @GET("data/groupOfUsers")
    Call<List<GroupOfUsers>> getGroupsOfUsers(@Query("filter") String filter);
}
