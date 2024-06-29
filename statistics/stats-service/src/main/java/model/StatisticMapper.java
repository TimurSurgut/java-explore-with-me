package model;

import dto.StatisticInDto;

public class StatisticMapper {

    public static Statistic toStatistic(StatisticInDto inDto) {
        return Statistic.builder()
                .app(inDto.getApp())
                .uri(inDto.getUri())
                .ip(inDto.getIp())
                .timestamp(inDto.getTimestamp())
                .build();
    }
}