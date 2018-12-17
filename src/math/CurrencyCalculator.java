package math;

import java.util.HashMap;

public class CurrencyCalculator {
	
	enum CurrencyEnum{
		DEFAULT,
		ALBINO_RHOA_FEATHER,
		APPRENTICE_CARTOGRAPHERS_SEAL,
		APPRENTICE_CARTOGRAPHERS_SEXTANT,
		ARMOURERS_SCRAP,
		BLACKSMITHS_WHETSTONE,
		BLESSED_ORB,
		BLESSING_OF_CHAYULA,
		BLESSING_OF_ESH,
		BLESSING_OF_TUL,
		BLESSING_OF_UUL_NETOL,
		BLESSING_OF_XOPH,
		CARTOGRAPHERS_CHISEL,
		CHAOS_ORB,
		CHROMATIC_ORB,
		DIVINE_ORB,
		EXALTED_ORB,
		GEMCUTTERS_PRISM,
		GLASSBLOWERS_BAUBLE,
		JEWELLERS_ORB,
		JOURNEYMAN_CARTOGRAPHERS_SEAL,
		JOURNEYMAN_CARTOGRAPHERS_SEXTANT,
		MASTER_CARTOGRAPHERS_SEAL,
		MASTER_CARTOGRAPHERS_SEXTANT,
		MIRROR_OF_KALANDRA,
		ORB_OF_ALCHEMY,
		ORB_OF_ALTERATION,
		ORB_OF_ANNULMENT,
		ORB_OF_AUGMENTATION,
		ORB_OF_CHANCE,
		ORB_OF_FUSING,
		ORB_OF_REGRET,
		ORB_OF_SCOURING,
		ORB_OF_TRANSMUTATION,
		PORTAL_SCROLL,
		REGAL_ORB,
		SCROLL_OF_WISDOM,
		SILVER_COIN,
		UNSHAPING_ORB,
		VAAL_ORB,
		
		// Shards
		ALCHEMY_SHARD,
		ALTERATION_SHARD,
		SCROLL_FRAGMENT,	
		SPLINTER_OF_CHAYULA,	
		SPLINTER_OF_ESH,	
		SPLINTER_OF_TUL,	
		SPLINTER_OF_UUL_NETOL,		
		SPLINTER_OF_XOPH,	
		TRANSMUTATION_SHARD,
		
		// Harbinger Currency
		ANCIENT_ORB,
		ANCIENT_SHARD,
		ANNULMENT_SHARD,
		BINDING_SHARD,
		CHAOS_SHARD,
		ENGINEERS_ORB,
		ENGINEERS_SHARD,
		EXALTED_SHARD,
		HARBINGERS_ORB,
		HARBINGERS_SHARD,
		HORIZON_SHARD,
		MIRROR_SHARD,
		ORB_OF_BINDING,
		ORB_OF_HORIZONS,
		REGAL_SHARD,
		
		// Perandus
		PERANDUS_COIN,
		
		// Lab
		OFFERING_TO_THE_GODDESS
		
	}
	
	private HashMap<CurrencyEnum, Double> weight_map;
	
	public CurrencyCalculator(){
		initializeWeightMap();
	}
	
	public CurrencyEnum compareCurrencies(CurrencyEnum a, CurrencyEnum b){
		CurrencyEnum output = CurrencyEnum.DEFAULT;
		
		if (weight_map.get(a) > weight_map.get(b)){
			output = a;
		}
		else if (weight_map.get(a) < weight_map.get(b)){
			output = b;
		}
		else{
			output = a;
		}
		
		
		return output;
	}
	
	private void initializeWeightMap(){
		weight_map.put(CurrencyEnum.ALBINO_RHOA_FEATHER,               0.0  );
		weight_map.put(CurrencyEnum.APPRENTICE_CARTOGRAPHERS_SEAL,     0.0  );
		weight_map.put(CurrencyEnum.APPRENTICE_CARTOGRAPHERS_SEXTANT,  0.0  );
		weight_map.put(CurrencyEnum.ARMOURERS_SCRAP,                   0.0  );
		weight_map.put(CurrencyEnum.BLACKSMITHS_WHETSTONE,             0.0  );
		weight_map.put(CurrencyEnum.BLESSED_ORB,                       0.0  );
		weight_map.put(CurrencyEnum.BLESSING_OF_CHAYULA,               0.0  );
		weight_map.put(CurrencyEnum.BLESSING_OF_ESH,                   0.0  );
		weight_map.put(CurrencyEnum.BLESSING_OF_TUL,                   0.0  );
		weight_map.put(CurrencyEnum.BLESSING_OF_UUL_NETOL,             0.0  );
		weight_map.put(CurrencyEnum.BLESSING_OF_XOPH,                  0.0  );
		weight_map.put(CurrencyEnum.CARTOGRAPHERS_CHISEL,              0.0  );
		weight_map.put(CurrencyEnum.CHAOS_ORB,                         0.0  );
		weight_map.put(CurrencyEnum.CHROMATIC_ORB,                     0.0  );
		weight_map.put(CurrencyEnum.DIVINE_ORB,                        0.0  );
		weight_map.put(CurrencyEnum.EXALTED_ORB,                       0.0  );
		weight_map.put(CurrencyEnum.GEMCUTTERS_PRISM,                  0.0  );
		weight_map.put(CurrencyEnum.GLASSBLOWERS_BAUBLE,               0.0  );
		weight_map.put(CurrencyEnum.JEWELLERS_ORB,                     0.0  );
		weight_map.put(CurrencyEnum.JOURNEYMAN_CARTOGRAPHERS_SEAL,     0.0  );
		weight_map.put(CurrencyEnum.JOURNEYMAN_CARTOGRAPHERS_SEXTANT,  0.0  );
		weight_map.put(CurrencyEnum.MASTER_CARTOGRAPHERS_SEAL,         0.0  );
		weight_map.put(CurrencyEnum.MASTER_CARTOGRAPHERS_SEXTANT,      0.0  );
		weight_map.put(CurrencyEnum.MIRROR_OF_KALANDRA,                0.0  );
		weight_map.put(CurrencyEnum.ORB_OF_ALCHEMY,                    0.0  );
		weight_map.put(CurrencyEnum.ORB_OF_ALTERATION,                 0.0  );
		weight_map.put(CurrencyEnum.ORB_OF_ANNULMENT,                  0.0  );
		weight_map.put(CurrencyEnum.ORB_OF_AUGMENTATION,               0.0  );
		weight_map.put(CurrencyEnum.ORB_OF_CHANCE,                     0.0  );
		weight_map.put(CurrencyEnum.ORB_OF_FUSING,                     0.0  );
		weight_map.put(CurrencyEnum.ORB_OF_REGRET,                     0.0  );
		weight_map.put(CurrencyEnum.ORB_OF_SCOURING,                   0.0  );
		weight_map.put(CurrencyEnum.ORB_OF_TRANSMUTATION,              0.0  );
		weight_map.put(CurrencyEnum.PORTAL_SCROLL,                     0.0  );
		weight_map.put(CurrencyEnum.REGAL_ORB,                         0.0  );
		weight_map.put(CurrencyEnum.SCROLL_OF_WISDOM,                  0.0  );
		weight_map.put(CurrencyEnum.SILVER_COIN,                       0.0  );
		weight_map.put(CurrencyEnum.UNSHAPING_ORB,                     0.0  );
		weight_map.put(CurrencyEnum.VAAL_ORB,                          0.0  );
               
		weight_map.put(CurrencyEnum.ALCHEMY_SHARD,                     0.0  );
		weight_map.put(CurrencyEnum.ALTERATION_SHARD,                  0.0  );
		weight_map.put(CurrencyEnum.SCROLL_FRAGMENT,	               0.0  );
		weight_map.put(CurrencyEnum.SPLINTER_OF_CHAYULA,	           0.0  );
		weight_map.put(CurrencyEnum.SPLINTER_OF_ESH,	               0.0  );
		weight_map.put(CurrencyEnum.SPLINTER_OF_TUL,	               0.0  );
		weight_map.put(CurrencyEnum.SPLINTER_OF_UUL_NETOL,		       0.0  );
		weight_map.put(CurrencyEnum.SPLINTER_OF_XOPH,	               0.0  );
		weight_map.put(CurrencyEnum.TRANSMUTATION_SHARD,               0.0  );
              
		weight_map.put(CurrencyEnum.ANCIENT_ORB,                       0.0  );
		weight_map.put(CurrencyEnum.ANCIENT_SHARD,                     0.0  );
		weight_map.put(CurrencyEnum.ANNULMENT_SHARD,                   0.0  );
		weight_map.put(CurrencyEnum.BINDING_SHARD,                     0.0  );
		weight_map.put(CurrencyEnum.CHAOS_SHARD,                       0.0  );
		weight_map.put(CurrencyEnum.ENGINEERS_ORB,                     0.0  );
		weight_map.put(CurrencyEnum.ENGINEERS_SHARD,                   0.0  );
		weight_map.put(CurrencyEnum.EXALTED_SHARD,                     0.0  );
		weight_map.put(CurrencyEnum.HARBINGERS_ORB,                    0.0  );
		weight_map.put(CurrencyEnum.HARBINGERS_SHARD,                  0.0  );
		weight_map.put(CurrencyEnum.HORIZON_SHARD,                     0.0  );
		weight_map.put(CurrencyEnum.MIRROR_SHARD,                      0.0  );
		weight_map.put(CurrencyEnum.ORB_OF_BINDING,                    0.0  );
		weight_map.put(CurrencyEnum.ORB_OF_HORIZONS,                   0.0  );
		weight_map.put(CurrencyEnum.REGAL_SHARD,                       0.0  );
                    
		weight_map.put(CurrencyEnum.PERANDUS_COIN,                     0.0  );
                  
		weight_map.put(CurrencyEnum.OFFERING_TO_THE_GODDESS,           0.0  );
	}

}
