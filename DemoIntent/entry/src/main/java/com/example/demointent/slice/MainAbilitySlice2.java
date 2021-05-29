package com.example.demointent.slice;

import com.example.demointent.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Text;

public class MainAbilitySlice2 extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main2);

        // 获取 Text 文字显示组件
        Text text = (Text) findComponentById(ResourceTable.Id_text);

        // 获取 Intent 中的数据 , 并显示到界面中
        text.setText("页面 2 数据 : " + intent.getIntParam("DATA", 0));
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