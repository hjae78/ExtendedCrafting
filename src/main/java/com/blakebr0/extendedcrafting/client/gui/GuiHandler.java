package com.blakebr0.extendedcrafting.client.gui;

import com.blakebr0.extendedcrafting.client.container.*;
import com.blakebr0.extendedcrafting.client.container.automationinterface.ContainerAutomationInterface;
import com.blakebr0.extendedcrafting.client.gui.automationinterface.GuiAutomationInterface;
import com.blakebr0.extendedcrafting.tile.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	public static final int CRAFTING_CORE = 0;

	public static final int HANDHELD_TABLE = 4;

	public static final int AUTOMATION_INTERFACE = 6;
	
	public static final int BASIC_TABLE = 7;
	public static final int ADVANCED_TABLE = 8;
	public static final int ELITE_TABLE = 9;
	public static final int ULTIMATE_TABLE = 10;

	public static final int COMPRESSOR = 13;
	
	public static final int ENDER_CRAFTER = 19;

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == CRAFTING_CORE) {
			return new GuiCraftingCore((TileCraftingCore) world.getTileEntity(new BlockPos(x, y, z)), new ContainerCraftingCore(player.inventory, (TileCraftingCore) world.getTileEntity(new BlockPos(x, y, z))));
		}
		if (ID == HANDHELD_TABLE) {
			return new GuiHandheldTable(new ContainerHandheldTable(player.inventory, world));
		}
		if (ID == AUTOMATION_INTERFACE) {
			return new GuiAutomationInterface(new ContainerAutomationInterface(player.inventory, (TileAutomationInterface) world.getTileEntity(new BlockPos(x, y, z))));
		}
		if (ID == BASIC_TABLE) {
			return new GuiBasicTable(new ContainerBasicTable(player.inventory, (TileBasicCraftingTable) world.getTileEntity(new BlockPos(x, y, z))));
		}
		if (ID == ADVANCED_TABLE) {
			return new GuiAdvancedTable(new ContainerAdvancedTable(player.inventory, (TileAdvancedCraftingTable) world.getTileEntity(new BlockPos(x, y, z))));
		}
		if (ID == ELITE_TABLE) {
			return new GuiEliteTable(new ContainerEliteTable(player.inventory, (TileEliteCraftingTable) world.getTileEntity(new BlockPos(x, y, z))));
		}
		if (ID == ULTIMATE_TABLE) {
			return new GuiUltimateTable(new ContainerUltimateTable(player.inventory, (TileUltimateCraftingTable) world.getTileEntity(new BlockPos(x, y, z))));
		}
		if (ID == COMPRESSOR) {
			return new GuiCompressor((TileCompressor) world.getTileEntity(new BlockPos(x, y, z)), new ContainerCompressor(player.inventory, (TileCompressor) world.getTileEntity(new BlockPos(x, y, z))));
		}
		if (ID == ENDER_CRAFTER) {
			return new GuiEnderCrafter((TileEnderCrafter) world.getTileEntity(new BlockPos(x, y, z)), new ContainerEnderCrafter(player.inventory, (TileEnderCrafter) world.getTileEntity(new BlockPos(x, y, z))));
		}
		return null;
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == CRAFTING_CORE) {
			return new ContainerCraftingCore(player.inventory, (TileCraftingCore) world.getTileEntity(new BlockPos(x, y, z)));
		}
		if (ID == HANDHELD_TABLE) {
			return new ContainerHandheldTable(player.inventory, world);
		}
		if (ID == AUTOMATION_INTERFACE) {
			return new ContainerAutomationInterface(player.inventory, (TileAutomationInterface) world.getTileEntity(new BlockPos(x, y, z)));
		}
		if (ID == BASIC_TABLE) {
			return new ContainerBasicTable(player.inventory, (TileBasicCraftingTable) world.getTileEntity(new BlockPos(x, y, z)));
		}
		if (ID == ADVANCED_TABLE) {
			return new ContainerAdvancedTable(player.inventory, (TileAdvancedCraftingTable) world.getTileEntity(new BlockPos(x, y, z)));
		}
		if (ID == ELITE_TABLE) {
			return new ContainerEliteTable(player.inventory, (TileEliteCraftingTable) world.getTileEntity(new BlockPos(x, y, z)));
		}
		if (ID == ULTIMATE_TABLE) {
			return new ContainerUltimateTable(player.inventory, (TileUltimateCraftingTable) world.getTileEntity(new BlockPos(x, y, z)));
		}
		if (ID == COMPRESSOR) {
			return new ContainerCompressor(player.inventory, (TileCompressor) world.getTileEntity(new BlockPos(x, y, z)));
		}
		if (ID == ENDER_CRAFTER) {
			return new ContainerEnderCrafter(player.inventory, (TileEnderCrafter) world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}

}
