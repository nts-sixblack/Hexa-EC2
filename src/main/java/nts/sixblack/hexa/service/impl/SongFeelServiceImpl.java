package nts.sixblack.hexa.service.impl;

import nts.sixblack.hexa.repository.SongFeelRepository;
import nts.sixblack.hexa.service.SongFeelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongFeelServiceImpl implements SongFeelService {
    @Autowired
    SongFeelRepository songFeelRepository;
}