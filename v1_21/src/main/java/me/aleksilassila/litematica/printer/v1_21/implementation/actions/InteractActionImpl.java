package me.aleksilassila.litematica.printer.v1_21.implementation.actions;

import me.aleksilassila.litematica.printer.v1_21.actions.InteractAction;
import me.aleksilassila.litematica.printer.v1_21.implementation.PrinterPlacementContext;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;

public class InteractActionImpl extends InteractAction {
    public InteractActionImpl(PrinterPlacementContext context) {
        super(context);
    }

    @Override
    protected void interact(MinecraftClient client, ClientPlayerEntity player, Hand hand, BlockHitResult hitResult) {
        client.interactionManager.interactBlock(player, hand, hitResult);
        client.interactionManager.interactItem(player, hand);
    }
}
