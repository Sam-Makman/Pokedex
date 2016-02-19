package com.makman.pokedex;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ntille on 2/3/16.
 */
public class Pokedex  {


        String[] mPokemonStrs = new String[]{
            "1,bulbasaur,1,7,69",
            "2,ivysaur,2,10,130",
            "3,venusaur,3,20,1000",
            "4,charmander,4,6,85",
            "5,charmeleon,5,11,190",
            "6,charizard,6,17,905",
            "7,squirtle,7,5,90",
            "8,wartortle,8,10,225",
            "9,blastoise,9,16,855",
            "10,caterpie,10,3,29",
            "11,metapod,11,7,99",
            "12,butterfree,12,11,320",
            "13,weedle,13,3,32",
            "14,kakuna,14,6,100",
            "15,beedrill,15,10,295",
            "16,pidgey,16,3,18",
            "17,pidgeotto,17,11,300",
            "18,pidgeot,18,15,395",
            "19,rattata,19,3,35",
            "20,raticate,20,7,185",
            "21,spearow,21,3,20",
            "22,fearow,22,12,380",
            "23,ekans,23,20,69",
            "24,arbok,24,35,650",
            "25,pikachu,25,4,60",
            "26,raichu,26,8,300",
            "27,sandshrew,27,6,120",
            "28,sandslash,28,10,295",
            "29,nidoran-f,29,4,70",
            "30,nidorina,30,8,200",
            "31,nidoqueen,31,13,600",
            "32,nidoran-m,32,5,90",
            "33,nidorino,33,9,195",
            "34,nidoking,34,14,620",
            "35,clefairy,35,6,75",
            "36,clefable,36,13,400",
            "37,vulpix,37,6,99",
            "38,ninetales,38,11,199",
            "39,jigglypuff,39,5,55",
            "40,wigglytuff,40,10,120",
            "41,zubat,41,8,75",
            "42,golbat,42,16,550",
            "43,oddish,43,5,54",
            "44,gloom,44,8,86",
            "45,vileplume,45,12,186",
            "46,paras,46,3,54",
            "47,parasect,47,10,295",
            "48,venonat,48,10,300",
            "49,venomoth,49,15,125",
            "50,diglett,50,2,8",
            "51,dugtrio,51,7,333",
            "52,meowth,52,4,42",
            "53,persian,53,10,320",
            "54,psyduck,54,8,196",
            "55,golduck,55,17,766",
            "56,mankey,56,5,280",
            "57,primeape,57,10,320",
            "58,growlithe,58,7,190",
            "59,arcanine,59,19,1550",
            "60,poliwag,60,6,124",
            "61,poliwhirl,61,10,200",
            "62,poliwrath,62,13,540",
            "63,abra,63,9,195",
            "64,kadabra,64,13,565",
            "65,alakazam,65,15,480",
            "66,machop,66,8,195",
            "67,machoke,67,15,705",
            "68,machamp,68,16,1300",
            "69,bellsprout,69,7,40",
            "70,weepinbell,70,10,64",
            "71,victreebel,71,17,155",
            "72,tentacool,72,9,455",
            "73,tentacruel,73,16,550",
            "74,geodude,74,4,200",
            "75,graveler,75,10,1050",
            "76,golem,76,14,3000",
            "77,ponyta,77,10,300",
            "78,rapidash,78,17,950",
            "79,slowpoke,79,12,360",
            "80,slowbro,80,16,785",
            "81,magnemite,81,3,60",
            "82,magneton,82,10,600",
            "83,farfetchd,83,8,150",
            "84,doduo,84,14,392",
            "85,dodrio,85,18,852",
            "86,seel,86,11,900",
            "87,dewgong,87,17,1200",
            "88,grimer,88,9,300",
            "89,muk,89,12,300",
            "90,shellder,90,3,40",
            "91,cloyster,91,15,1325",
            "92,gastly,92,13,1",
            "93,haunter,93,16,1",
            "94,gengar,94,15,405",
            "95,onix,95,88,2100",
            "96,drowzee,96,10,324",
            "97,hypno,97,16,756",
            "98,krabby,98,4,65",
            "99,kingler,99,13,600",
            "100,voltorb,100,5,104",
            "101,electrode,101,12,666",
            "102,exeggcute,102,4,25",
            "103,exeggutor,103,20,1200",
            "104,cubone,104,4,65",
            "105,marowak,105,10,450",
            "106,hitmonlee,106,15,498",
            "107,hitmonchan,107,14,502",
            "108,lickitung,108,12,655",
            "109,koffing,109,6,10",
            "110,weezing,110,12,95",
            "111,rhyhorn,111,10,1150",
            "112,rhydon,112,19,1200",
            "113,chansey,113,11,346",
            "114,tangela,114,10,350",
            "115,kangaskhan,115,22,800",
            "116,horsea,116,4,80",
            "117,seadra,117,12,250",
            "118,goldeen,118,6,150",
            "119,seaking,119,13,390",
            "120,staryu,120,8,345",
            "121,starmie,121,11,800",
            "122,mr-mime,122,13,545",
            "123,scyther,123,15,560",
            "124,jynx,124,14,406",
            "125,electabuzz,125,11,300",
            "126,magmar,126,13,445",
            "127,pinsir,127,15,550",
            "128,tauros,128,14,884",
            "129,magikarp,129,9,100",
            "130,gyarados,130,65,2350",
            "131,lapras,131,25,2200",
            "132,ditto,132,3,40",
            "133,eevee,133,3,65",
            "134,vaporeon,134,10,290",
            "135,jolteon,135,8,245",
            "136,flareon,136,9,250",
            "137,porygon,137,8,365",
            "138,omanyte,138,4,75",
            "139,omastar,139,10,350",
            "140,kabuto,140,5,115",
            "141,kabutops,141,13,405",
            "142,aerodactyl,142,18,590",
            "143,snorlax,143,21,4600",
            "144,articuno,144,17,554",
            "145,zapdos,145,16,526",
            "146,moltres,146,20,600",
            "147,dratini,147,18,33",
            "148,dragonair,148,40,165",
            "149,dragonite,149,22,2100",
            "150,mewtwo,150,20,1220",
            "151,mew,151,4,40",
            "152,chikorita,152,9,64",
            "153,bayleef,153,12,158",
            "154,meganium,154,18,1005",
            "155,cyndaquil,155,5,79",
            "156,quilava,156,9,190",
            "157,typhlosion,157,17,795",
            "158,totodile,158,6,95",
            "159,croconaw,159,11,250",
            "160,feraligatr,160,23,888",
            "161,sentret,161,8,60",
            "162,furret,162,18,325",
            "163,hoothoot,163,7,212",
            "164,noctowl,164,16,408",
            "165,ledyba,165,10,108",
            "166,ledian,166,14,356",
            "167,spinarak,167,5,85",
            "168,ariados,168,11,335",
            "169,crobat,169,18,750",
            "170,chinchou,170,5,120",
            "171,lanturn,171,12,225",
            "172,pichu,172,3,20",
            "173,cleffa,173,3,30",
            "174,igglybuff,174,3,10",
            "175,togepi,175,3,15",
            "176,togetic,176,6,32",
            "177,natu,177,2,20",
            "178,xatu,178,15,150",
            "179,mareep,179,6,78",
            "180,flaaffy,180,8,133",
            "181,ampharos,181,14,615",
            "182,bellossom,182,4,58",
            "183,marill,183,4,85",
            "184,azumarill,184,8,285",
            "185,sudowoodo,185,12,380",
            "186,politoed,186,11,339",
            "187,hoppip,187,4,5",
            "188,skiploom,188,6,10",
            "189,jumpluff,189,8,30",
            "190,aipom,190,8,115",
            "191,sunkern,191,3,18",
            "192,sunflora,192,8,85",
            "193,yanma,193,12,380",
            "194,wooper,194,4,85",
            "195,quagsire,195,14,750",
            "196,espeon,196,9,265",
            "197,umbreon,197,10,270",
            "198,murkrow,198,5,21",
            "199,slowking,199,20,795",
            "200,misdreavus,200,7,10",
            "201,unown,201,5,50",
            "202,wobbuffet,202,13,285",
            "203,girafarig,203,15,415",
            "204,pineco,204,6,72",
            "205,forretress,205,12,1258",
            "206,dunsparce,206,15,140",
            "207,gligar,207,11,648",
            "208,steelix,208,92,4000",
            "209,snubbull,209,6,78",
            "210,granbull,210,14,487",
            "211,qwilfish,211,5,39",
            "212,scizor,212,18,1180",
            "213,shuckle,213,6,205",
            "214,heracross,214,15,540",
            "215,sneasel,215,9,280",
            "216,teddiursa,216,6,88",
            "217,ursaring,217,18,1258",
            "218,slugma,218,7,350",
            "219,magcargo,219,8,550",
            "220,swinub,220,4,65",
            "221,piloswine,221,11,558",
            "222,corsola,222,6,50",
            "223,remoraid,223,6,120",
            "224,octillery,224,9,285",
            "225,delibird,225,9,160",
            "226,mantine,226,21,2200",
            "227,skarmory,227,17,505",
            "228,houndour,228,6,108",
            "229,houndoom,229,14,350",
            "230,kingdra,230,18,1520",
            "231,phanpy,231,5,335",
            "232,donphan,232,11,1200",
            "233,porygon2,233,6,325",
            "234,stantler,234,14,712",
            "235,smeargle,235,12,580",
            "236,tyrogue,236,7,210",
            "237,hitmontop,237,14,480",
            "238,smoochum,238,4,60",
            "239,elekid,239,6,235",
            "240,magby,240,7,214",
            "241,miltank,241,12,755",
            "242,blissey,242,15,468",
            "243,raikou,243,19,1780",
            "244,entei,244,21,1980",
            "245,suicune,245,20,1870",
            "246,larvitar,246,6,720",
            "247,pupitar,247,12,1520",
            "248,tyranitar,248,20,2020",
            "249,lugia,249,52,2160",
            "250,ho-oh,250,38,1990",
            "251,celebi,251,6,50",
            "252,treecko,252,5,50",
            "253,grovyle,253,9,216",
            "254,sceptile,254,17,522",
            "255,torchic,255,4,25",
            "256,combusken,256,9,195",
            "257,blaziken,257,19,520",
            "258,mudkip,258,4,76",
            "259,marshtomp,259,7,280",
            "260,swampert,260,15,819",
            "261,poochyena,261,5,136",
            "262,mightyena,262,10,370",
            "263,zigzagoon,263,4,175",
            "264,linoone,264,5,325",
            "265,wurmple,265,3,36",
            "266,silcoon,266,6,100",
            "267,beautifly,267,10,284",
            "268,cascoon,268,7,115",
            "269,dustox,269,12,316",
            "270,lotad,270,5,26",
            "271,lombre,271,12,325",
            "272,ludicolo,272,15,550",
            "273,seedot,273,5,40",
            "274,nuzleaf,274,10,280",
            "275,shiftry,275,13,596",
            "276,taillow,276,3,23",
            "277,swellow,277,7,198",
            "278,wingull,278,6,95",
            "279,pelipper,279,12,280",
            "280,ralts,280,4,66",
            "281,kirlia,281,8,202",
            "282,gardevoir,282,16,484",
            "283,surskit,283,5,17",
            "284,masquerain,284,8,36",
            "285,shroomish,285,4,45",
            "286,breloom,286,12,392",
            "287,slakoth,287,8,240",
            "288,vigoroth,288,14,465",
            "289,slaking,289,20,1305",
            "290,nincada,290,5,55",
            "291,ninjask,291,8,120",
            "292,shedinja,292,8,12",
            "293,whismur,293,6,163",
            "294,loudred,294,10,405",
            "295,exploud,295,15,840",
            "296,makuhita,296,10,864",
            "297,hariyama,297,23,2538",
            "298,azurill,298,2,20",
            "299,nosepass,299,10,970",
            "300,skitty,300,6,110",
            "301,delcatty,301,11,326",
            "302,sableye,302,5,110",
            "303,mawile,303,6,115",
            "304,aron,304,4,600",
            "305,lairon,305,9,1200",
            "306,aggron,306,21,3600",
            "307,meditite,307,6,112",
            "308,medicham,308,13,315",
            "309,electrike,309,6,152",
            "310,manectric,310,15,402",
            "311,plusle,311,4,42",
            "312,minun,312,4,42",
            "313,volbeat,313,7,177",
            "314,illumise,314,6,177",
            "315,roselia,315,3,20",
            "316,gulpin,316,4,103",
            "317,swalot,317,17,800",
            "318,carvanha,318,8,208",
            "319,sharpedo,319,18,888",
            "320,wailmer,320,20,1300",
            "321,wailord,321,145,3980",
            "322,numel,322,7,240",
            "323,camerupt,323,19,2200",
            "324,torkoal,324,5,804",
            "325,spoink,325,7,306",
            "326,grumpig,326,9,715",
            "327,spinda,327,11,50",
            "328,trapinch,328,7,150",
            "329,vibrava,329,11,153",
            "330,flygon,330,20,820",
            "331,cacnea,331,4,513",
            "332,cacturne,332,13,774",
            "333,swablu,333,4,12",
            "334,altaria,334,11,206",
            "335,zangoose,335,13,403",
            "336,seviper,336,27,525",
            "337,lunatone,337,10,1680",
            "338,solrock,338,12,1540",
            "339,barboach,339,4,19",
            "340,whiscash,340,9,236",
            "341,corphish,341,6,115",
            "342,crawdaunt,342,11,328",
            "343,baltoy,343,5,215",
            "344,claydol,344,15,1080",
            "345,lileep,345,10,238",
            "346,cradily,346,15,604",
            "347,anorith,347,7,125",
            "348,armaldo,348,15,682",
            "349,feebas,349,6,74",
            "350,milotic,350,62,1620",
            "351,castform,351,3,8",
            "352,kecleon,352,10,220",
            "353,shuppet,353,6,23",
            "354,banette,354,11,125",
            "355,duskull,355,8,150",
            "356,dusclops,356,16,306",
            "357,tropius,357,20,1000",
            "358,chimecho,358,6,10",
            "359,absol,359,12,470",
            "360,wynaut,360,6,140",
            "361,snorunt,361,7,168",
            "362,glalie,362,15,2565",
            "363,spheal,363,8,395",
            "364,sealeo,364,11,876",
            "365,walrein,365,14,1506",
            "366,clamperl,366,4,525",
            "367,huntail,367,17,270",
            "368,gorebyss,368,18,226",
            "369,relicanth,369,10,234",
            "370,luvdisc,370,6,87",
            "371,bagon,371,6,421",
            "372,shelgon,372,11,1105",
            "373,salamence,373,15,1026",
            "374,beldum,374,6,952",
            "375,metang,375,12,2025",
            "376,metagross,376,16,5500",
            "377,regirock,377,17,2300",
            "378,regice,378,18,1750",
            "379,registeel,379,19,2050",
            "380,latias,380,14,400",
            "381,latios,381,20,600",
            "382,kyogre,382,45,3520",
            "383,groudon,383,35,9500",
            "384,rayquaza,384,70,2065",
            "385,jirachi,385,3,11",
            "386,deoxys-normal,386,17,608",
            "387,turtwig,387,4,102",
            "388,grotle,388,11,970",
            "389,torterra,389,22,3100",
            "390,chimchar,390,5,62",
            "391,monferno,391,9,220",
            "392,infernape,392,12,550",
            "393,piplup,393,4,52",
            "394,prinplup,394,8,230",
            "395,empoleon,395,17,845",
            "396,starly,396,3,20",
            "397,staravia,397,6,155",
            "398,staraptor,398,12,249",
            "399,bidoof,399,5,200",
            "400,bibarel,400,10,315",
            "401,kricketot,401,3,22",
            "402,kricketune,402,10,255",
            "403,shinx,403,5,95",
            "404,luxio,404,9,305",
            "405,luxray,405,14,420",
            "406,budew,406,2,12",
            "407,roserade,407,9,145",
            "408,cranidos,408,9,315",
            "409,rampardos,409,16,1025",
            "410,shieldon,410,5,570",
            "411,bastiodon,411,13,1495",
            "412,burmy,412,2,34",
            "413,wormadam-plant,413,5,65",
            "414,mothim,414,9,233",
            "415,combee,415,3,55",
            "416,vespiquen,416,12,385",
            "417,pachirisu,417,4,39",
            "418,buizel,418,7,295",
            "419,floatzel,419,11,335",
            "420,cherubi,420,4,33",
            "421,cherrim,421,5,93",
            "422,shellos,422,3,63",
            "423,gastrodon,423,9,299",
            "424,ambipom,424,12,203",
            "425,drifloon,425,4,12",
            "426,drifblim,426,12,150",
            "427,buneary,427,4,55",
            "428,lopunny,428,12,333",
            "429,mismagius,429,9,44",
            "430,honchkrow,430,9,273",
            "431,glameow,431,5,39",
            "432,purugly,432,10,438",
            "433,chingling,433,2,6",
            "434,stunky,434,4,192",
            "435,skuntank,435,10,380",
            "436,bronzor,436,5,605",
            "437,bronzong,437,13,1870",
            "438,bonsly,438,5,150",
            "439,mime-jr,439,6,130",
            "440,happiny,440,6,244",
            "441,chatot,441,5,19",
            "442,spiritomb,442,10,1080",
            "443,gible,443,7,205",
            "444,gabite,444,14,560",
            "445,garchomp,445,19,950",
            "446,munchlax,446,6,1050",
            "447,riolu,447,7,202",
            "448,lucario,448,12,540",
            "449,hippopotas,449,8,495",
            "450,hippowdon,450,20,3000",
            "451,skorupi,451,8,120",
            "452,drapion,452,13,615",
            "453,croagunk,453,7,230",
            "454,toxicroak,454,13,444",
            "455,carnivine,455,14,270",
            "456,finneon,456,4,70",
            "457,lumineon,457,12,240",
            "458,mantyke,458,10,650",
            "459,snover,459,10,505",
            "460,abomasnow,460,22,1355",
            "461,weavile,461,11,340",
            "462,magnezone,462,12,1800",
            "463,lickilicky,463,17,1400",
            "464,rhyperior,464,24,2828",
            "465,tangrowth,465,20,1286",
            "466,electivire,466,18,1386",
            "467,magmortar,467,16,680",
            "468,togekiss,468,15,380",
            "469,yanmega,469,19,515",
            "470,leafeon,470,10,255",
            "471,glaceon,471,8,259",
            "472,gliscor,472,20,425",
            "473,mamoswine,473,25,2910",
            "474,porygon-z,474,9,340",
            "475,gallade,475,16,520",
            "476,probopass,476,14,3400",
            "477,dusknoir,477,22,1066",
            "478,froslass,478,13,266",
            "479,rotom,479,3,3",
            "480,uxie,480,3,3",
            "481,mesprit,481,3,3",
            "482,azelf,482,3,3",
            "483,dialga,483,54,6830",
            "484,palkia,484,42,3360",
            "485,heatran,485,17,4300",
            "486,regigigas,486,37,4200",
            "487,giratina-altered,487,45,7500",
            "488,cresselia,488,15,856",
            "489,phione,489,4,31",
            "490,manaphy,490,3,14",
            "491,darkrai,491,15,505",
            "492,shaymin-land,492,2,21",
            "493,arceus,493,32,3200",
            "494,victini,494,4,40",
            "495,snivy,495,6,81",
            "496,servine,496,8,160",
            "497,serperior,497,33,630",
            "498,tepig,498,5,99",
            "499,pignite,499,10,555",
            "500,emboar,500,16,1500",
            "501,oshawott,501,5,59",
            "502,dewott,502,8,245",
            "503,samurott,503,15,946",
            "504,patrat,504,5,116",
            "505,watchog,505,11,270",
            "506,lillipup,506,4,41",
            "507,herdier,507,9,147",
            "508,stoutland,508,12,610",
            "509,purrloin,509,4,101",
            "510,liepard,510,11,375",
            "511,pansage,511,6,105",
            "512,simisage,512,11,305",
            "513,pansear,513,6,110",
            "514,simisear,514,10,280",
            "515,panpour,515,6,135",
            "516,simipour,516,10,290",
            "517,munna,517,6,233",
            "518,musharna,518,11,605",
            "519,pidove,519,3,21",
            "520,tranquill,520,6,150",
            "521,unfezant,521,12,290",
            "522,blitzle,522,8,298",
            "523,zebstrika,523,16,795",
            "524,roggenrola,524,4,180",
            "525,boldore,525,9,1020",
            "526,gigalith,526,17,2600",
            "527,woobat,527,4,21",
            "528,swoobat,528,9,105",
            "529,drilbur,529,3,85",
            "530,excadrill,530,7,404",
            "531,audino,531,11,310",
            "532,timburr,532,6,125",
            "533,gurdurr,533,12,400",
            "534,conkeldurr,534,14,870",
            "535,tympole,535,5,45",
            "536,palpitoad,536,8,170",
            "537,seismitoad,537,15,620",
            "538,throh,538,13,555",
            "539,sawk,539,14,510",
            "540,sewaddle,540,3,25",
            "541,swadloon,541,5,73",
            "542,leavanny,542,12,205",
            "543,venipede,543,4,53",
            "544,whirlipede,544,12,585",
            "545,scolipede,545,25,2005",
            "546,cottonee,546,3,6",
            "547,whimsicott,547,7,66",
            "548,petilil,548,5,66",
            "549,lilligant,549,11,163",
            "550,basculin-red-striped,550,10,180",
            "551,sandile,551,7,152",
            "552,krokorok,552,10,334",
            "553,krookodile,553,15,963",
            "554,darumaka,554,6,375",
            "555,darmanitan-standard,555,13,929",
            "556,maractus,556,10,280",
            "557,dwebble,557,3,145",
            "558,crustle,558,14,2000",
            "559,scraggy,559,6,118",
            "560,scrafty,560,11,300",
            "561,sigilyph,561,14,140",
            "562,yamask,562,5,15",
            "563,cofagrigus,563,17,765",
            "564,tirtouga,564,7,165",
            "565,carracosta,565,12,810",
            "566,archen,566,5,95",
            "567,archeops,567,14,320",
            "568,trubbish,568,6,310",
            "569,garbodor,569,19,1073",
            "570,zorua,570,7,125",
            "571,zoroark,571,16,811",
            "572,minccino,572,4,58",
            "573,cinccino,573,5,75",
            "574,gothita,574,4,58",
            "575,gothorita,575,7,180",
            "576,gothitelle,576,15,440",
            "577,solosis,577,3,10",
            "578,duosion,578,6,80",
            "579,reuniclus,579,10,201",
            "580,ducklett,580,5,55",
            "581,swanna,581,13,242",
            "582,vanillite,582,4,57",
            "583,vanillish,583,11,410",
            "584,vanilluxe,584,13,575",
            "585,deerling,585,6,195",
            "586,sawsbuck,586,19,925",
            "587,emolga,587,4,50",
            "588,karrablast,588,5,59",
            "589,escavalier,589,10,330",
            "590,foongus,590,2,10",
            "591,amoonguss,591,6,105",
            "592,frillish,592,12,330",
            "593,jellicent,593,22,1350",
            "594,alomomola,594,12,316",
            "595,joltik,595,1,6",
            "596,galvantula,596,8,143",
            "597,ferroseed,597,6,188",
            "598,ferrothorn,598,10,1100",
            "599,klink,599,3,210",
            "600,klang,600,6,510",
            "601,klinklang,601,6,810",
            "602,tynamo,602,2,3",
            "603,eelektrik,603,12,220",
            "604,eelektross,604,21,805",
            "605,elgyem,605,5,90",
            "606,beheeyem,606,10,345",
            "607,litwick,607,3,31",
            "608,lampent,608,6,130",
            "609,chandelure,609,10,343",
            "610,axew,610,6,180",
            "611,fraxure,611,10,360",
            "612,haxorus,612,18,1055",
            "613,cubchoo,613,5,85",
            "614,beartic,614,26,2600",
            "615,cryogonal,615,11,1480",
            "616,shelmet,616,4,77",
            "617,accelgor,617,8,253",
            "618,stunfisk,618,7,110",
            "619,mienfoo,619,9,200",
            "620,mienshao,620,14,355",
            "621,druddigon,621,16,1390",
            "622,golett,622,10,920",
            "623,golurk,623,28,3300",
            "624,pawniard,624,5,102",
            "625,bisharp,625,16,700",
            "626,bouffalant,626,16,946",
            "627,rufflet,627,5,105",
            "628,braviary,628,15,410",
            "629,vullaby,629,5,90",
            "630,mandibuzz,630,12,395",
            "631,heatmor,631,14,580",
            "632,durant,632,3,330",
            "633,deino,633,8,173",
            "634,zweilous,634,14,500",
            "635,hydreigon,635,18,1600",
            "636,larvesta,636,11,288",
            "637,volcarona,637,16,460",
            "638,cobalion,638,21,2500",
            "639,terrakion,639,19,2600",
            "640,virizion,640,20,2000",
            "641,tornadus-incarnate,641,15,630",
            "642,thundurus-incarnate,642,15,610",
            "643,reshiram,643,32,3300",
            "644,zekrom,644,29,3450",
            "645,landorus-incarnate,645,15,680",
            "646,kyurem,646,30,3250",
            "647,keldeo-ordinary,647,14,485",
            "648,meloetta-aria,648,6,65",
            "649,genesect,649,15,825",
            "650,chespin,650,4,90",
            "651,quilladin,651,7,290",
            "652,chesnaught,652,16,900",
            "653,fennekin,653,4,94",
            "654,braixen,654,10,145",
            "655,delphox,655,15,390",
            "656,froakie,656,3,70",
            "657,frogadier,657,6,109",
            "658,greninja,658,15,400",
            "659,bunnelby,659,4,50",
            "660,diggersby,660,10,424",
            "661,fletchling,661,3,17",
            "662,fletchinder,662,7,160",
            "663,talonflame,663,12,245",
            "664,scatterbug,664,3,25",
            "665,spewpa,665,3,84",
            "666,vivillon,666,12,170",
            "667,litleo,667,6,135",
            "668,pyroar,668,15,815",
            "669,flabebe,669,1,1",
            "670,floette,670,2,9",
            "671,florges,671,11,100",
            "672,skiddo,672,9,310",
            "673,gogoat,673,17,910",
            "674,pancham,674,6,80",
            "675,pangoro,675,21,1360",
            "676,furfrou,676,12,280",
            "677,espurr,677,3,35",
            "678,meowstic-male,678,6,85",
            "679,honedge,679,8,20",
            "680,doublade,680,8,45",
            "681,aegislash-shield,681,17,530",
            "682,spritzee,682,2,5",
            "683,aromatisse,683,8,155",
            "684,swirlix,684,4,35",
            "685,slurpuff,685,8,50",
            "686,inkay,686,4,35",
            "687,malamar,687,15,470",
            "688,binacle,688,5,310",
            "689,barbaracle,689,13,960",
            "690,skrelp,690,5,73",
            "691,dragalge,691,18,815",
            "692,clauncher,692,5,83",
            "693,clawitzer,693,13,353",
            "694,helioptile,694,5,60",
            "695,heliolisk,695,10,210",
            "696,tyrunt,696,8,260",
            "697,tyrantrum,697,25,2700",
            "698,amaura,698,13,252",
            "699,aurorus,699,27,2250",
            "700,sylveon,700,10,235",
            "701,hawlucha,701,8,215",
            "702,dedenne,702,2,22",
            "703,carbink,703,3,57",
            "704,goomy,704,3,28",
            "705,sliggoo,705,8,175",
            "706,goodra,706,20,1505",
            "707,klefki,707,2,30",
            "708,phantump,708,4,70",
            "709,trevenant,709,15,710",
            "710,pumpkaboo-average,710,4,50",
            "711,gourgeist-average,711,9,125",
            "712,bergmite,712,10,995",
            "713,avalugg,713,20,5050",
            "714,noibat,714,5,80",
            "715,noivern,715,15,850",
            "716,xerneas,716,30,2150",
            "717,yveltal,717,58,2030",
            "718,zygarde,718,50,3050",
            "719,diancie,719,7,88",
            "720,hoopa,720,5,90",
            "721,volcanion,721,17,1950"};

    private ArrayList<Pokemon> mPokemons;

    public Pokedex() {
        mPokemons = new ArrayList<>();
        for (String pokemonStr : mPokemonStrs) {
            mPokemons.add(new Pokemon(pokemonStr));
        }
    }

    public List<Pokemon> getPokemons(int count) {
        if (count >= mPokemons.size()) {
            count = mPokemons.size() - 1;
        }

        return mPokemons.subList(0, count);
    }
        public ArrayList<Pokemon> getmPokemons() {
                return mPokemons;
        }

}
