package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Knight {

    @Autowired()
    @QuestType(type= QuestType.Type.DRAGON)
    private Quest quest;

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public String goQuest(){
       return quest.goQuest();
    }

}
