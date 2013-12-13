package lol4j.protocol.resource;

import lol4j.exception.InvalidRegionException;
import lol4j.protocol.dto.league.LeagueDto;
import lol4j.util.Region;

import java.util.Map;

/**
 * Created by Aaryn101 on 12/11/13.
 */
public interface LeagueResource {
    Map<String, LeagueDto> getLeaguesData(Region region, long summonerId) throws InvalidRegionException;
}
