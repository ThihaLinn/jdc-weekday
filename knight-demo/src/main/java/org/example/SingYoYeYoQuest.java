package org.example;

import org.springframework.stereotype.Component;

@Component @QuestType(type = QuestType.Type.YOYEYO)
public class SingYoYeYoQuest implements Quest{

    public  String goQuest(){
        return "Knight sing 'YoYeYo' hapi hapi hapi";
    }
}
