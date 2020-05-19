package org.bx.scheduler.client.server.handler;

import com.alibaba.fastjson.JSONObject;
import io.netty.channel.Channel;
import lombok.extern.slf4j.Slf4j;
import org.bx.scheduler.client.server.HandleContext;
import org.bx.scheduler.common.bean.ServerHeartbeatInfo;
import org.bx.scheduler.common.serializer.ISerializer;

@Slf4j
public class ClientTaskExecuteHandler implements ITaskHandler {
    @Override
    public void handle(HandleContext context) {
        final ISerializer serializer = context.getSerializer();
        final Channel channel = context.getChannel();
        final JSONObject jsonObject = (JSONObject) context.getInfo();
        final ServerHeartbeatInfo engineHeartbeatInfo = jsonObject.toJavaObject(ServerHeartbeatInfo.class);

    }
}
