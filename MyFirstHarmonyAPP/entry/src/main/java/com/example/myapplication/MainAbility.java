package com.example.myapplication;

import com.example.myapplication.slice.MainAbilitySlice;
import com.example.myapplication.slice.MyRegister;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.TextField;
import ohos.agp.window.dialog.ToastDialog;
//https://developer.huawei.com/consumer/cn/forum/topic/0203467865705350182?fid=0101303901040230869

public class MainAbility extends AbilitySlice {
    private Button buttonLogin,buttonRegister;
    private TextField text_name;
    private TextField text_password;

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        //super.setMainRoute(MainAbilitySlice.class.getName());
        super.setUIContent(ResourceTable.Layout_ability_main);

        buttonLogin = (Button) findComponentById(ResourceTable.Id_login_btnLogin);
        buttonRegister = (Button) findComponentById(ResourceTable.Id_login_btnRegister);
        text_name = (TextField) findComponentById(ResourceTable.Id_text_name);
        text_password = (TextField) findComponentById(ResourceTable.Id_text_password);

        if (buttonLogin != null) {
            buttonLogin.setClickedListener(new Component.ClickedListener() {
                @Override
                // 在组件中增加对点击事件的检测
                public void onClick(Component component) {
                    // 此处添加按钮被点击需要执行的操作 ,见下方的点击事件代码
                    new ToastDialog(getContext()).setText("登录").show();
                }
            });
        }
        if (buttonRegister != null) {
            buttonRegister.setClickedListener(new Component.ClickedListener() {
                @Override
                // 在组件中增加对点击事件的检测
                public void onClick(Component component) {
                    // 此处添加按钮被点击需要执行的操作 ,见下方的点击事件代码
                    new ToastDialog(getContext()).setText("注册").show();

                    AbilitySlice slice = new MyRegister();
                    Intent intent1 = new Intent();
                    present(slice, intent1);
                }
            });
        }

    }


    private void register(){        // 为按钮设置点击回调
        buttonLogin.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                if(buttonLogin!=null){
                    new ToastDialog(getContext())
                            .setText("This is a ToastDialog")
                            .show();
//                    present(new LoginAbilitySlice(),new Intent());
                }
            }
        });
    };

    private void login(){
        buttonRegister.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
//                if(button2!=null && name.equals("蛟龙腾飞") && password.equals("2019")){
//                    present(new HomeAbilitySlice(),new Intent());
//                    new ToastDialog(context).setText("登录成功").show();
//                }else {
//                    new ToastDialog(context).setText("用户名或密码有误请重新输入").show();
//                }
            }
        });

    };


}



