package earth.terrarium.pastel.data;

import earth.terrarium.pastel.PastelCommon;
import earth.terrarium.pastel.registries.PastelBiomeTags;
import earth.terrarium.pastel.registries.PastelBiomes;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class PastelBiomeTagsProvider extends TagsProvider<Biome> {
    protected PastelBiomeTagsProvider(
        PackOutput output,
        CompletableFuture<HolderLookup.Provider> lookupProvider,
        @Nullable ExistingFileHelper existingFileHelper
    ) {
        super(output, Registries.BIOME, lookupProvider, PastelCommon.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        tag(Tags.Biomes.IS_UNDERGROUND)
            .add(PastelBiomes.AZURE_SPIRES);
        tag(Tags.Biomes.IS_CAVE).add(PastelBiomes.AZURE_SPIRES).addTag(PastelBiomeTags.IMBRIFER_BIOMES);
        tag(Tags.Biomes.IS_COLD).add(PastelBiomes.AZURE_SPIRES, PastelBiomes.HOWLING_SPIRES);
        tag(Tags.Biomes.NO_DEFAULT_MONSTERS).add(PastelBiomes.AZURE_SPIRES);
        tag(Tags.Biomes.IS_DENSE_VEGETATION)
            .add(PastelBiomes.CRYSTAL_GARDENS, PastelBiomes.DRAGONROT_SWAMP, PastelBiomes.NOXSHROOM_FOREST);
        tag(Tags.Biomes.IS_DRY).add(PastelBiomes.RAZOR_EDGE, PastelBiomes.HOWLING_SPIRES, PastelBiomes.DEEP_BARRENS);
        tag(Tags.Biomes.IS_FLORAL).add(PastelBiomes.CRYSTAL_GARDENS);
        tag(Tags.Biomes.IS_SPARSE_VEGETATION)
            .add(PastelBiomes.DEEP_BARRENS, PastelBiomes.HOWLING_SPIRES, PastelBiomes.RAZOR_EDGE);
        tag(Tags.Biomes.IS_TEMPERATE)
            .add(
                PastelBiomes.BLACK_LANGAST,
                PastelBiomes.CRYSTAL_GARDENS,
                PastelBiomes.DEEP_BARRENS,
                PastelBiomes.DEEP_DRIPSTONE_CAVES,
                PastelBiomes.NOXSHROOM_FOREST,
                PastelBiomes.RAZOR_EDGE
            );
        tag(TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath("c", "is_warm")))
            .add(PastelBiomes.DRAGONROT_SWAMP); // ????????
        tag(Tags.Biomes.IS_WET)
            .add(
                PastelBiomes.BLACK_LANGAST,
                PastelBiomes.CRYSTAL_GARDENS,
                PastelBiomes.DEEP_DRIPSTONE_CAVES,
                PastelBiomes.DRAGONROT_SWAMP
            );

    }
}
