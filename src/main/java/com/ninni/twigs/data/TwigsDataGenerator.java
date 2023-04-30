package com.ninni.twigs.data;

import com.ninni.twigs.Twigs;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Twigs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TwigsDataGenerator {

    private TwigsDataGenerator() {
    }

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        boolean server = event.includeServer();
        generator.addProvider(server, (DataProvider.Factory<TwigsDatapackBuiltinEntriesProvider>) output ->
            new TwigsDatapackBuiltinEntriesProvider(output, event.getLookupProvider())
        );
    }

}
