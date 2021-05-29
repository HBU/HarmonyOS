package com.example.demointent.slice;

import com.example.demointent.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;

//        原文链接：https://blog.csdn.net/shulianghan/article/details/111417425
public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        // 获取 XML 布局中的 Button 按钮
        Button button = (Button) findComponentById(ResourceTable.Id_button);

        // 设置 Button 按钮点击事件
        button.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                // 初始化要跳转的界面
                AbilitySlice slice = new MainAbilitySlice2();

                // 初始化传递的 Intent 意图
                Intent intent = new Intent();
                intent.setParam("DATA", 888);

                // 跳转到 MainAbilitySlice2 界面
                present(slice, intent);
            }
        });

    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
