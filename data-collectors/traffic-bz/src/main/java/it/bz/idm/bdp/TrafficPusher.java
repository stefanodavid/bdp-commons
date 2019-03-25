package it.bz.idm.bdp;


import org.springframework.stereotype.Component;

import it.bz.idm.bdp.dto.DataMapDto;
import it.bz.idm.bdp.dto.RecordDtoImpl;
import it.bz.idm.bdp.json.JSONPusher;

@Component
public class TrafficPusher extends JSONPusher {

	public static final String TRAFFIC_SENSOR_IDENTIFIER = "TrafficSensor";

	public static final String ENVIRONMENTSTATION_IDENTIFIER = "Environmentstation";

	public static final String METEOSTATION_IDENTIFIER = "Meteostation";

	@Override
	public String initIntegreenTypology() {
		return TRAFFIC_SENSOR_IDENTIFIER;
	}

	@Override
	public <T> DataMapDto<RecordDtoImpl> mapData(T data) {
		return null;
	}

}
