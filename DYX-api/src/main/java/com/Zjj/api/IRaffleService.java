package com.Zjj.api;

import com.Zjj.api.dto.RaffleAwardListRequestDTO;
import com.Zjj.api.dto.RaffleAwardResponseDTO;
import com.Zjj.api.dto.RaffleRequestDTO;
import com.Zjj.api.dto.RaffleResponseDTO;
import com.Zjj.types.model.Response;

import java.util.List;

public interface IRaffleService {
    /**
     * 策略装配接口
     *
     * @param strategyId 策略ID
     * @return 装配结果
     */
    Response<Boolean> strategyArmory(Long strategyId);

    /**
     * 查询抽奖奖品列表配置
     *
     * @param requestDTO 抽奖奖品列表查询请求参数
     * @return 奖品列表数据
     */
    Response<List<RaffleAwardResponseDTO>> queryRaffleAwardList(RaffleAwardListRequestDTO requestDTO);

    /**
     * 随机抽奖接口
     *
     * @param requestDTO 请求参数
     * @return 抽奖结果
     */
    Response<RaffleResponseDTO> randomRaffle(RaffleRequestDTO requestDTO);

}
