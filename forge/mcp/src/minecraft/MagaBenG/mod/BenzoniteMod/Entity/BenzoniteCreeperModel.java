package MagaBenG.mod.BenzoniteMod.Entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class BenzoniteCreeperModel extends ModelBase
{
    //variables init:
    public ModelRenderer Body;
    public ModelRenderer Head;
    public ModelRenderer LLeg;
    public ModelRenderer RArm;
    public ModelRenderer RArm0;
    public ModelRenderer RLeg;
    {
        //constructor:
        Body = new ModelRenderer(this, "Body");
        Body.addBox(0F, 0F, 0F, 16, 24, 6);
        Body.setRotationPoint(-8F, 16F, 0F);
        Head = new ModelRenderer(this, "Head");
        Head.addBox(0F, 0F, 0F, 12, 13, 10);
        Head.setRotationPoint(-6F, 40F, -4F);
        LLeg = new ModelRenderer(this, "LLeg");
        LLeg.addBox(0F, 0F, 0F, 5, 16, 4);
        LLeg.setRotationPoint(-8F, 0F, 0F);
        RArm = new ModelRenderer(this, "RArm");
        RArm.mirror = true;
        RArm.addBox(0F, 0F, 0F, 5, 5, 17);
        RArm.setRotationPoint(8F, 33F, -13F);
        RArm0 = new ModelRenderer(this, "RArm0");
        RArm0.addBox(0F, 0F, 0F, 5, 6, 17);
        RArm0.setRotationPoint(-13F, 31F, -13F);
        RLeg = new ModelRenderer(this, "Rleg");
        RLeg.addBox(0F, 0F, 0F, 5, 16, 4);
        RLeg.setRotationPoint(3F, 0F, 0F);
        //render:
        Body.render(5F);
        Head.render(5F);
        LLeg.render(5F);
        RArm.render(5F);
        RArm0.render(5F);
        RLeg.render(5F);
    }
}
