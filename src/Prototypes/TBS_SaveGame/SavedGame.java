package Prototypes.TBS_SaveGame;

import java.io.Serializable;
import java.util.Arrays;

class SavedGame implements Serializable {
    private static final long serialVersionUID = 1L;

    private TerritoriesInfo territoriesInfo;
    private ResourcesInfo resourcesInfo;
    private DiplomacyInfo diplomacyInfo;

    public SavedGame (TerritoriesInfo territoriesInfo, ResourcesInfo resourcesInfo, DiplomacyInfo diplomacyInfo) {
        this.territoriesInfo = territoriesInfo;
        this.resourcesInfo = resourcesInfo;
        this.diplomacyInfo = diplomacyInfo;
    }

    public TerritoriesInfo getTerritoriesInfo() {
        return territoriesInfo;
    }

    public ResourcesInfo getResourcesInfo() {
        return resourcesInfo;
    }

    public DiplomacyInfo getDiplomacyInfo() {
        return diplomacyInfo;
    }

    public void setTerritoriesInfo(TerritoriesInfo territoriesInfo) {
        this.territoriesInfo = territoriesInfo;
    }

    public void setResourcesInfo(ResourcesInfo resourcesInfo) {
        this.resourcesInfo = resourcesInfo;
    }

    public void setDiplomacyInfo(DiplomacyInfo diplomacyInfo) {
        this.diplomacyInfo = diplomacyInfo;
    }

    @Override
    public String toString() {
        return "SavedGame{" +
                "territoriesInfo=" + Arrays.toString(territoriesInfo.getInfo()) +
                ", resourcesInfo=" + Arrays.toString(resourcesInfo.getInfo()) +
                ", diplomacyInfo=" + Arrays.toString(diplomacyInfo.getInfo()) +
                '}';
    }
}
