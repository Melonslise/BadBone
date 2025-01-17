package subaraki.badbone.client.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import subaraki.badbone.client.init.BadBoneShaders;
import subaraki.badbone.mod.BadBone;

@Mod.EventBusSubscriber(modid = BadBone.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class BadBoneClientModEvents
{
	private BadBoneClientModEvents() {}

	@SubscribeEvent
	public static void registerReloadListeners(RegisterClientReloadListenersEvent e)
	{
		e.registerReloadListener(BadBoneShaders.INSTANCE);
	}
}