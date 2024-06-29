package service;

import dto.StatisticInDto;
import dto.StatisticViewDto;

import java.util.List;

public interface StatisticService {

    void postHit(StatisticInDto inDto);

    List<StatisticViewDto> getStatistic(String start, String end, List<String> uris, Boolean unique);
}