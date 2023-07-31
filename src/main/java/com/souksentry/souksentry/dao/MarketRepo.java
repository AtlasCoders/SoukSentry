package com.souksentry.souksentry.dao;

import com.souksentry.souksentry.models.Market;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MarketRepo extends SoukSentryRepo<Market, Long> {

    @Query("select m from Market m where m.uuid = :marketId")
    Market findMarketById(UUID marketId);
}
