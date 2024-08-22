package org.multicoder.mcsm.networking;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import org.multicoder.mcsm.Mcsm;

@SuppressWarnings("all")
public record SetPos1C2SPacket() implements CustomPacketPayload
{
    public static final ResourceLocation ID = new ResourceLocation(Mcsm.MODID,"structure_pos1");

    public SetPos1C2SPacket(FriendlyByteBuf byteBuf) {this();}

    @Override
    public void write(FriendlyByteBuf friendlyByteBuf) {}

    @Override
    public ResourceLocation id() {return ID;}
}