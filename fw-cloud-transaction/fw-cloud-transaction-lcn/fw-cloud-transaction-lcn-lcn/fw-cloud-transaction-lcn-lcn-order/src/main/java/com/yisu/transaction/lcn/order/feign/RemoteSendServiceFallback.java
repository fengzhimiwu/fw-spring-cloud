package com.yisu.transaction.lcn.order.feign;

import com.yisu.common.result.FwResult;
import com.yisu.transacation.base.dao.model.FwTradeLog;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RemoteSendServiceFallback implements FallbackFactory<RemoteSendServiceFeign> {




    @Override
    public RemoteSendServiceFeign create(Throwable throwable) {

        return tradeLog -> log.error("远程调用失败",throwable);
    }
}
