package nts.sixblack.hexa.service;

import nts.sixblack.hexa.model.SongUserInfo;

import java.util.List;

public interface SongUserService {
    List<SongUserInfo> findUserBySongId(long songId);
}
