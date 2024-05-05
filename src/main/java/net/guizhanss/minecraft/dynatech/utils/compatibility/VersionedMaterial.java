package net.guizhanss.minecraft.dynatech.utils.compatibility;

import org.bukkit.Material;

import javax.annotation.Nonnull;

public enum VersionedMaterial {
    GRASS(Material.getMaterial("SHORT_GRASS"), Material.getMaterial("GRASS"));

    private final Material material;

    VersionedMaterial(Material... materials) {
        for (Material mat : materials) {
            if (mat != null) {
                this.material = mat;
                return;
            }
        }
        throw new IllegalArgumentException("No valid material found");
    }

    @Nonnull
    public Material get() {
        return material;
    }
}
