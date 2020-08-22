package br.com.sincro.server;

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

		Utils.log(ctx.channel().remoteAddress(), s);
		ctx.channel().writeAndFlush("Thanks\n");
		Utils.log(s);

	}

	@Override
	public void channelInactive(ChannelHandlerContext ctx) {
		Utils.log(ctx.channel().remoteAddress(), "Channel Inactive");
	}

}
