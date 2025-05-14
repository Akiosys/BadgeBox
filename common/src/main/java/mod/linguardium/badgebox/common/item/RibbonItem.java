package mod.linguardium.badgebox.common.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class RibbonItem extends Item {
    public RibbonItem(Settings settings) {
        super(settings);
    }
    @Override
    public void appendTooltip(ItemStack itemStack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("item.badgebox.ribbon.tooltip"));
        tooltip.add(Text.translatable("item.badgebox.ribbon.tooltip2"));
        tooltip.add(Text.translatable("item.badgebox.ribbon.tooltip3"));
        tooltip.add(Text.translatable("item.badgebox.ribbon.tooltip4"));
    }
}
