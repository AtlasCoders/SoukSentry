package com.souksentry.souksentry.dao;

import com.souksentry.souksentry.models.Market;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface MarketRepo {

    @Query("select m from market m where uuid = :marketId")
    Market findMarketById(UUID marketId);
}
