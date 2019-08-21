package cn.edu.fudan.selab.edge.Domain;

import java.util.Arrays;

public class Edge {

    private String edgeIPAddress;
    private int locationId;
    private Entity[] entities;
    private String ability;

    @Override
    public String toString() {
        return "Edge{" +
                "edgeIPAddress='" + edgeIPAddress + '\'' +
                ", locationId=" + locationId +
                ", entities=" + Arrays.toString(entities) +
                ", ability='" + ability + '\'' +
                '}';
    }

    public void setEdgeIPAddress(String edgeIPAddress) {
        this.edgeIPAddress = edgeIPAddress;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public void setEntities(Entity[] entities) {
        this.entities = entities;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getEdgeIPAddress() {
        return edgeIPAddress;
    }

    public int getLocationId() {
        return locationId;
    }

    public Entity[] getEntities() {
        return entities;
    }

    public String getAbility() {
        return ability;
    }
}
