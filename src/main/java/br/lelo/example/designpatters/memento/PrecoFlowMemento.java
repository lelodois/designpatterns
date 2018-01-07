package br.lelo.example.designpatters.memento;

import java.util.ArrayList;
import java.util.List;

import br.lelo.example.designpatters.commons.Status.StatusEnum;

public class PrecoFlowMemento {

    private List<StatusEnum> statusList = new ArrayList<StatusEnum>();

    public void addStatus(StatusEnum status) {
        statusList.add(status);
    }

    public StatusEnum getStatus(int position) {
        return statusList.get(position);
    }

}
