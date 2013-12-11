package lol4j.service.impl;

import lol4j.exception.InvalidRegionException;
import lol4j.protocol.dto.champion.ChampionListDto;
import lol4j.protocol.resource.ChampionResource;
import lol4j.util.Regions;

/**
 * Created by Aaryn101 on 12/10/13.
 */
public class ChampionApiRequestManager extends AbstractApiRequestManager implements ChampionResource {
    private static final String RESOURCE_VERSION = "v1.1";
    private static final String RESOURCE_PATH = "champion";
    private static final String SLASH = "/";
    private static final String RESOURCE_URI = RESOURCE_VERSION + SLASH + RESOURCE_PATH;

    public ChampionApiRequestManager() {
        this.getSupportedRegions().add(Regions.EUW);
        this.getSupportedRegions().add(Regions.EUNE);
        this.getSupportedRegions().add(Regions.NA);
    }

    @Override
    public ChampionListDto getAllChampions(String region, boolean freeToPlay) throws InvalidRegionException {
        return get(buildPath(region), ChampionListDto.class);
    }

    private String buildPath(String region) {
        return region + SLASH + RESOURCE_URI;
    }
}
