package com.immersion.riot.userinfo.app;

import lombok.Data;
import java.util.List;

@Data
public class UserInfoResponse {
    int profileIconId;
    String name;
    String id;
    String puuid;
    long summonerLevel;
    List<LeagueEntryResponse> rank;
}
