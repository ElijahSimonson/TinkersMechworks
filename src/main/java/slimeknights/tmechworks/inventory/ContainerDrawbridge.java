package slimeknights.tmechworks.inventory;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import slimeknights.mantle.inventory.BaseContainer;
import slimeknights.tmechworks.blocks.logic.DrawbridgeLogicBase;

public class ContainerDrawbridge extends BaseContainer<DrawbridgeLogicBase>
{
    public InventoryPlayer inventoryPlayer;

    public ContainerDrawbridge (DrawbridgeLogicBase tile, InventoryPlayer inventoryPlayer)
    {
        super(tile);

        this.inventoryPlayer = inventoryPlayer;

        //TODO: Uncomment when disguise done
        //addSlotToContainer(new SlotDisguise(tile, 35, 36));
        addSlotToContainer(new Slot(tile, 0, 80, 36));

        addPlayerInventory(inventoryPlayer, 8, 84);
    }
}
