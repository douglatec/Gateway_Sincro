package br.com.sincro.server;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import br.com.sincro.entity.PositionEntity;
import br.com.sincro.service.PostionService;
import br.com.sincro.util.Utils;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class SimpleTCPChannelHandler extends SimpleChannelInboundHandler<String> {

	@Override
	public void channelActive(ChannelHandlerContext ctx) {
		Utils.log(ctx.channel().remoteAddress(), "Channel Active");
	}

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, String s) throws Exception {
		PositionEntity positionEntity = new PositionEntity();
		PostionService postionService = new PostionService();

		Utils.log(ctx.channel().remoteAddress(), s);

		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String date = new SimpleDateFormat("dd/MM/yyyy").format(timestamp.getTime());
		positionEntity.setDate(date);
		positionEntity.setPosition(s);
		postionService.save(positionEntity);

		ctx.channel().writeAndFlush("Thanks\n");
	}

	@Override
	public void channelInactive(ChannelHandlerContext ctx) {
		Utils.log(ctx.channel().remoteAddress(), "Channel Inactive");
	}

}
