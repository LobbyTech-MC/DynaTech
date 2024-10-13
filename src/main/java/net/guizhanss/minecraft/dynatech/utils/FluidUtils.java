package net.guizhanss.minecraft.dynatech.utils;

import me.profelements.dynatech.fluids.FluidStack;
import net.guizhanss.guizhanlib.utils.StringUtil;
import org.bukkit.NamespacedKey;

import javax.annotation.Nonnull;

public class FluidUtils {

    private FluidUtils() {
    }

    @Nonnull
    public static String getFluidType(@Nonnull String fluidName){
        return switch (fluidName) {
            case "WATER" -> "水";
            case "LAVA" -> "岩浆";
            case "NO_FLUID" -> "没有液体";
            default -> fluidName;
        };
    }

    @Nonnull
    public static String getFluidType(@Nonnull NamespacedKey fluid) {
        if (fluid.equals(FluidStack.LAVA_FLUID)) {
            return "岩浆";
        } else if (fluid.equals(FluidStack.WATER_FLUID)) {
            return "水";
        } else if (fluid.equals(FluidStack.MILK_FLUID)) {
            return "牛奶";
        } else if (fluid.equals(FluidStack.POTION_FLUID)) {
            return "药水";
        } else {
            return StringUtil.humanize(fluid.toString());
        }
    }
}
