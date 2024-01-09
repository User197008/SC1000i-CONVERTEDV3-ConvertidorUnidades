import java.util.HashMap;

/**
 *
 * @author RYZEN
 */
public class Conversion {
    
    
    
     public static String Lenght(String Unit){
        HashMap<String, String> Lenght =new HashMap<>();
        Lenght.put("metre","1");
        Lenght.put("Km","0.001");
        Lenght.put("furlong","0.00497097");
        Lenght.put("inch", "39.37007874");
        Lenght.put("foot","3.2808399");
        Lenght.put("fathom", "0.546806649");
        Lenght.put("yard", "1.093613298337");
        Lenght.put("rod", "0.1988");
        Lenght.put("pole", "0.1988");
        Lenght.put("mile", "0.000621371");
        Lenght.put("nautic mile", "0.000539957");
        Lenght.put("league", "0.000207125");
        Lenght.put("angstrom", "10000000000");
        Lenght.put("micron", "1000000");
        Lenght.put("parsec", "3.2407788498994e-17");
        Lenght.put("light-year", "1.0570209999567e-16");
        Lenght.put("li(市里)", "0.002");
        Lenght.put("yin(引)", "0.03");
        Lenght.put("cho(町)", "0.009167");
        Lenght.put("shaku(尺)", "3.3");
        Lenght.put("rin(厘)", "3300");
        return Lenght.get(Unit);
    }
    public static String Area(String Unit){
        HashMap<String, String> Area =new HashMap<>();
        Area.put("cm²","10000");
        Area.put("m²", "1");
        Area.put("Km²", "0.000001");
        Area.put("Ha", "0.0001");
        Area.put("in²","1550");
        Area.put("ft²","10.76391041671");
        Area.put("yd²","1.195990046301");
        Area.put("rod²","0.03954");
        Area.put("acre","0.000247096614");
        Area.put("mi²","3.8610215854245e-7");
        Area.put("qing(頃 or 顷)","0.000015");
        Area.put("li(釐 or 厘)","0.15");
        Area.put("fang chi(方尺)","9");
        Area.put("shaku(勺)","30.25");
        Area.put("tsubo(坪)","0.3025");
        Area.put("cho(町, 町歩)","0.0001008");
        return Area.get(Unit);
    }
    public static String Volume(String Unit){
        HashMap<String, String> Volume =new HashMap<>();
        Volume.put("m³","1");
        Volume.put("hectolitre","10");
        Volume.put("litre","1000");
        Volume.put("barrel(petroleum)","6.28970375");
        Volume.put("gallon","264.20079260");
        Volume.put("barrel(dry)","8.648");
        Volume.put("bushel","28.38");
        Volume.put("gallon(dry)","227");
        Volume.put("imperial barrel(dry)","6.11");
        Volume.put("imperial bushel","27.5");
        Volume.put("imperial gallon","219.97360316762");
        Volume.put("shaku(勺)","55440");
        Volume.put("sho(升)","554.4");
        Volume.put("koku(石)","5.544");
        Volume.put("dan(市石)","10");
        Volume.put("sheng(市升)","1000");
        Volume.put("shao(勺)","100000");
        return Volume.get(Unit);
    }
    public static String Angle(String Unit){
        HashMap<String, String> Angle =new HashMap<>();
        Angle.put("sextant","6");
        Angle.put("rad","6.283");
        Angle.put("deg","360");
        Angle.put("grad","400");
        Angle.put("minute","21600");
        Angle.put("second","1296000");
        return Angle.get(Unit);
    }
    public static String Speed(String Unit){
        HashMap<String, String> Speed =new HashMap<>();
        Speed.put("m/s","1");
        Speed.put("km/s","0.001");
        Speed.put("km/h","3.6");
        Speed.put("mi/s","0.0006214");
        Speed.put("mi/h","2.2369362920544");
        Speed.put("ft/s","3.2808398950131");
        Speed.put("knot","1.9440124416796");
        Speed.put("yd/s","1.0936132983377");
        return Speed.get(Unit);
    }
    public static String Angular_Velocity(String Unit){
        HashMap<String, String> Angular_Velocity =new HashMap<>();
        Angular_Velocity.put("r.p.s","1");
        Angular_Velocity.put("rad/s","6.2831853071796");
        Angular_Velocity.put("rad/min","376.99111843078");
        Angular_Velocity.put("rad/h","22619.467105847");
        Angular_Velocity.put("r.p.m","60");
        Angular_Velocity.put("r.p.h","3600");
        return Angular_Velocity.get(Unit);
    }
    public static String Acceleration(String Unit){
        HashMap<String, String> Acceleration =new HashMap<>();
        Acceleration.put("m/s²","1");
        Acceleration.put("km/s²","0.001");
        Acceleration.put("mi/s²","0.0006214");
        Acceleration.put("ft/s²","3.2808398950131");
        Acceleration.put("in/s²","39.370078740158");
        Acceleration.put("yd/s²","1.0936132983377");
        return Acceleration.get(Unit);
    }
    public static String Mass(String Unit){
        HashMap<String, String> Mass =new HashMap<>();
        Mass.put("Kg","1");
        Mass.put("gram","1000");
        Mass.put("carat","5000");
        Mass.put("newton","9.807");
        Mass.put("Kilonewton","0.009807");
        Mass.put("Quintal(Metric)","0.01");
        Mass.put("ton","0.001");
        Mass.put("ton (Imperial)","0.00098425196850394");
        Mass.put("ton(USA)","0.0011023170704822");
        Mass.put("quintal (Imperial)","0.01968");
        Mass.put("quintal(USA)","0.02205");
        Mass.put("pound","2.20462247");
        Mass.put("slug","0.06852177");
        Mass.put("ounce","35.27");
        Mass.put("drachm","564.36593487");
        Mass.put("grain","15430");
        Mass.put("pound(Troy)","2.679");
        Mass.put("ounce(Troy)","32.15");
        Mass.put("pennyweight","643");
        Mass.put("carat(Troy)","4878");
        Mass.put("drachm(Troy)","257.20164609");
        Mass.put("atomic mass unit","6.0240963855422e+26");
        Mass.put("Planck Mass","45950000");
        Mass.put("kanme(貫目)","0.2667");
        Mass.put("kin(斤)","1.667");
        Mass.put("hyakume(百目)","2.667");
        Mass.put("monnme(匁)","266.7");
        Mass.put("fun(分)","2667");
        Mass.put("dan(市担 / 擔)","0.02");
        Mass.put("jin(市斤)","2");
        Mass.put("liang(市两)","20");
        Mass.put("qian(市钱)","200");
        Mass.put("fen(市分)","2000");
        Mass.put("li(市厘)","20000");
        Mass.put("hao(毫)","200000");
        Mass.put("si(絲)","2000000");
        Mass.put("hu(忽)","20000000");
        return Mass.get(Unit);
    }
    public static String Flow_Liquid(String Unit){
        HashMap<String, String> Flow_Liquid =new HashMap<>();
        Flow_Liquid.put("m³/s","0.00027777777777778");
        Flow_Liquid.put("m³/min","0.016666666666667");
        Flow_Liquid.put("m³/h","1");
        Flow_Liquid.put("lt/s","0.27777000021777");
        Flow_Liquid.put("lt/min","16.666200013066");
        Flow_Liquid.put("lt/h","999.97200078398");
        Flow_Liquid.put("barrels/sec","0.001747");
        Flow_Liquid.put("barrels/min","0.1048");
        Flow_Liquid.put("barrels/h","6.29");
        Flow_Liquid.put("barrels/dia","150.95289011888");
        Flow_Liquid.put("gallons(USA)/sec","0.07338");
        Flow_Liquid.put("gallons(Imperial)/sec","0.0611");
        Flow_Liquid.put("gallons(USA)/min","4.403");
        Flow_Liquid.put("gallons(USA)/h","264.2");
        Flow_Liquid.put("gallons(Imperial)/min","3.666");
        Flow_Liquid.put("gallons(Imperial)/h","220");
        Flow_Liquid.put("ft³/s","0.009809629644858");
        Flow_Liquid.put("ft³/min","0.58857777869148");
        Flow_Liquid.put("ft³/h","35.314666721489");
        Flow_Liquid.put("in³/s","16.951040026315");
        Flow_Liquid.put("in³/min","1017.0624015789");
        Flow_Liquid.put("in³/h","61020");
        return Flow_Liquid.get(Unit);
    }
    public static String Flow_Mass(String Unit){
        HashMap<String, String> Flow_Mass =new HashMap<>();
        Flow_Mass.put("Kg/sec","1");
        Flow_Mass.put("Kg/min","60");
        Flow_Mass.put("Kg/h","3600");
        Flow_Mass.put("g/sec","1000");
        Flow_Mass.put("MT/min","0.06");
        Flow_Mass.put("MT/h","3.6");
        Flow_Mass.put("NT(Imperial)/h","3.543");
        Flow_Mass.put("NT(USA)/h","3.968");
        Flow_Mass.put("lb/sec","2.204622476038");
        Flow_Mass.put("lb/min","132.27734856228");
        Flow_Mass.put("ounce/sec","35.27");
        Flow_Mass.put("slug/sec","0.068521779647661");
        Flow_Mass.put("slug/min","0.0011420296607943");
        return Flow_Mass.get(Unit);
    }
    public static String Density(String Unit){
        HashMap<String, String> Density =new HashMap<>();
        Density.put("Kg/m³","1");
        Density.put("g/m³","1000");
        Density.put("g/Lt","1");
        Density.put("mg/Lt","1000");
        Density.put("g/cm³","0.001");
        Density.put("g/mL","0.001");
        Density.put("mg/mL","1");
        Density.put("lb/ft³","0.062427956447242");
        Density.put("lb/in³","3.6127289610673e-5");
        Density.put("lb/gal(USA)","0.008345");
        Density.put("lb/gal (Imperial)","0.01002");
        Density.put("ounces/ft³","0.9988");
        Density.put("ounces/in³","0.000578");
        Density.put("slug/ft³","0.00194032");
        Density.put("slug/in³","1.1228707884801e-6");
        Density.put("Planck Density","1.94e-97");
        return Density.get(Unit);
    }

    public static String Force(String Unit){
        HashMap<String, String> Force =new HashMap<>();
        Force.put("Newton","1");
        Force.put("dyne","100000");
        Force.put("kgf","0.10197162129779");
        Force.put("kilopound","0.10197162129779");
        Force.put("lbf","0.22480902473349");
        Force.put("poundal","7.233");
        Force.put("Planck Force","8.263e-45");
        return Force.get(Unit);
    }

    public static String Specific_Weight(String Unit){
        HashMap<String, String> Specific_Weight =new HashMap<>();
        Specific_Weight.put("N/m³","1");
        Specific_Weight.put("dyn/cm³","0.1");
        Specific_Weight.put("gf/lt","0.10197447650319");
        Specific_Weight.put("gf/cm³","0.00010197162129779");
        Specific_Weight.put("kgf/m³","0.10197162129779");
        Specific_Weight.put("kgf/cm³","1.0197162129779e-7");
        Specific_Weight.put("kgf/in³","1.6710154843907e-6");
        Specific_Weight.put("kgf/ft³","0.0028875147570271");
        Specific_Weight.put("lb/in³","3.6839598760853e-6");
        Specific_Weight.put("lb/ft³","0.0063658826658753");
        return Specific_Weight.get(Unit);
    }
    public static String Pressure(String Unit){
        HashMap<String, String> Pressure =new HashMap<>();
        Pressure.put("Pascal","1");
        Pressure.put("Bar","1.0e-5");
        Pressure.put("Milibar","0.01");
        Pressure.put("mm of Hg.[0 C](Torricelli)","0.0075006375541921");
        Pressure.put("atm","9.8692326671601e-6");
        Pressure.put("cm of Hg [0°C]","0.00075006375541921");
        Pressure.put("cm of H2O [0°C]","0.010197442889221");
        Pressure.put("ft of H2O[39.2 °F]","0.00033456229215318");
        Pressure.put("in of Hg [32 °F]","0.00029529980164712");
        Pressure.put("in of Hg [60 °F]","0.00029613397100848");
        Pressure.put("in of H2O [39.2 °F]","0.0040147421331128");
        Pressure.put("in of H2O [60 °F]","0.0040186465198521");
        Pressure.put("Psi (lbf/in²)","0.00014503774389728");
        Pressure.put("lbf/ft²","0.020885441817176");
        Pressure.put("dyn/cm²","10");
        Pressure.put("kgf/m²","0.102");
        Pressure.put("N/m²","1");
        Pressure.put("kN/m²","0.001");
        Pressure.put("Planck Pressure","2.158e-114");
        return Pressure.get(Unit);
    }
    public static String Kinematic_Viscosity(String Unit){
        HashMap<String, String> Kinematic_Viscosity =new HashMap<>();
        Kinematic_Viscosity.put("m²/s","1");
        Kinematic_Viscosity.put("m²/min","60");
        Kinematic_Viscosity.put("m²/h","3600");
        Kinematic_Viscosity.put("Stokes (St)","10000");
        Kinematic_Viscosity.put("Centistokes (cSt)","1000000");
        Kinematic_Viscosity.put("cm²/min","600000");
        Kinematic_Viscosity.put("cm²/h","36000000");
        Kinematic_Viscosity.put("in²/s","1550.0031000062");
        Kinematic_Viscosity.put("in²/min","93000.186000372");
        Kinematic_Viscosity.put("in²/h","5580011.1600223");
        Kinematic_Viscosity.put("ft²/s","10.76391041671");
        Kinematic_Viscosity.put("ft²/min","645.83462500258");
        Kinematic_Viscosity.put("ft²/h","38750.077500155");
        return Kinematic_Viscosity.get(Unit);
    }
    public static String Dynamic_Viscosity(String Unit){
        HashMap<String, String> Dynamic_Viscosity =new HashMap<>();
        Dynamic_Viscosity.put("N.s/m²","1");
        Dynamic_Viscosity.put("Poise (Po)","10");
        Dynamic_Viscosity.put("Centipoise (cPo)","1000");
        Dynamic_Viscosity.put("lb/s.ft","0.67196893069637");
        Dynamic_Viscosity.put("lb/h.ft","2419.0881505069");
        Dynamic_Viscosity.put("slug/s.ft","0.020885438436607");
        Dynamic_Viscosity.put("slug/s.in","0.0017404532030506");
        Dynamic_Viscosity.put("kgf·s/m²","0.10197162129779");
        Dynamic_Viscosity.put("lbf.s/in²","0.00014503779039706");
        Dynamic_Viscosity.put("lbf.s/ft²","0.020885441817176");
        Dynamic_Viscosity.put("lbf.h/ft²","5.8015116158823e-6");
        return Dynamic_Viscosity.get(Unit);
    }
    public static String Torque(String Unit){
        HashMap<String, String> Torque =new HashMap<>();
        Torque.put("N.m","1");
        Torque.put("dyn.cm","10000000");
        Torque.put("kilogram-meters (kgf.m)","0.10197162129779");
        Torque.put("lbf.ft","0.7376");
        return Torque.get(Unit);
    }
    public static String Energy_Work(String Unit){
        HashMap<String, String> Energy_Work =new HashMap<>();
        Energy_Work.put("Joule(J)","1");
        Energy_Work.put("Ergio(erg)","10000000");
        Energy_Work.put("Calorie [Average]","0.23866234528714");
        Energy_Work.put("Calorie [15 °C]","0.23890295761861");
        Energy_Work.put("Calorie [20 °C]","0.2391257562352");
        Energy_Work.put("Calorie [Thermochemistry]","0.23900573613767");
        Energy_Work.put("Kilowatt hour (kW.h)","2.7777777777778e-7");
        Energy_Work.put("Watt hour (W.h)","0.00027777777777778");
        Energy_Work.put("Watt second (W.s)","1");
        Energy_Work.put("Electron volt(eV)","6241507648655550000");
        Energy_Work.put("foot-poundal","23.730360457056");
        Energy_Work.put("foot-pound(ft.lbf)","0.73756212116966");
        Energy_Work.put("Btu[Average])","0.00094708628903179");
        Energy_Work.put("Btu [39 °F]","0.00094369001670331");
        Energy_Work.put("Btu [60 °F]","0.00094815489058293");
        Energy_Work.put("Btu [Thermochemistry]","0.00094845165267701");
        Energy_Work.put("liter atmosphere","101.32738879319");
        Energy_Work.put("ft³.Atmosphere","2.8694404591105");
        Energy_Work.put("Planck Energy","0.0000000005112");
        return Energy_Work.get(Unit);
    }
    public static String Power(String Unit){
        HashMap<String, String> Power =new HashMap<>();
        Power.put("Watt(W)","1");
        Power.put("Kilowatt(kW)","0.001");
        Power.put("kcal/sec","0.00023883448770002");
        Power.put("kcal/h","0.85980415572009");
        Power.put("Horsepower(hp)","0.0013410218586563");
        Power.put("tax horsepower(CV)","0.0013596211551613");
        Power.put("BTU/h","3.4095106405145");
        Power.put("BTU/sec","0.00094708628903179");
        Power.put("ft.lbf/sec","0.73756212116966");
        Power.put("joule/sec","1");
        Power.put("joule/h","3600");
        return Power.get(Unit);
    }

    public static String Electric_Charge(String Unit){
        HashMap<String, String> Electric_Charge =new HashMap<>();
        Electric_Charge.put("Coulomb(C)","1");
        Electric_Charge.put("Abcoulomb","0.1");
        Electric_Charge.put("Ampere-hora","0.00027777777777778");
        Electric_Charge.put("Statcoulomb","2997601918.4652");
        Electric_Charge.put("Franklin(Fr)","2997924536.8431");
        return Electric_Charge.get(Unit);
    }
    public static String Electric_Current(String Unit){
        HashMap<String, String> Electric_Current =new HashMap<>();
        Electric_Current.put("Ampere(A)","1");
        Electric_Current.put("Abampere","0.1");
        Electric_Current.put("Statampere","2997924536.8431");
        Electric_Current.put("Gilbert(Gi)","1.2566370858485");
        return Electric_Current.get(Unit);
    }
    public static String Voltage_Electromotive_Force_Electric_Power(String Unit){
        HashMap<String, String> Voltage_Electromotive_Force_Electric_Power =new HashMap<>();
        Voltage_Electromotive_Force_Electric_Power.put("Volt(V)","1");
        Voltage_Electromotive_Force_Electric_Power.put("Abvolt","100000000");
        Voltage_Electromotive_Force_Electric_Power.put("Statvolt","0.0033355570380254");
        Voltage_Electromotive_Force_Electric_Power.put("Milivolt(mV)","1000");
        Voltage_Electromotive_Force_Electric_Power.put("Kilovolt(kV)","0.001");
        return Voltage_Electromotive_Force_Electric_Power.get(Unit);
    }
    public static String Electric_Resistance(String Unit){
        HashMap<String, String> Electric_Resistance =new HashMap<>();
        Electric_Resistance.put("Ohm(Ω)","1");
        Electric_Resistance.put("Abohm","1000000000");
        Electric_Resistance.put("Statohm","1.1127183709803E-12");
        return Electric_Resistance.get(Unit);
    }
    public static String Capacitance(String Unit){
        HashMap<String, String> Capacitance =new HashMap<>();
        Capacitance.put("Farad(F)","1");
        Capacitance.put("Abfarad","1.0e-9");
        Capacitance.put("Statfarad","898472.5965858");
        Capacitance.put("Microfarad(μF)","1000000");
        Capacitance.put("Nanofarad(nF)","1.eE-9");
        Capacitance.put("Picofarad(pF)","1.0e-12");
        return Capacitance.get(Unit);
    }
    public static String Inductance(String Unit){
        HashMap<String, String> Inductance =new HashMap<>();
        Inductance.put("Henry(H)","1");
        Inductance.put("Abhenry","1000000000");
        Inductance.put("Stathenry","1.1127183709803e-21");
        Inductance.put("Microhenry(μH)","1000000");
        Inductance.put("Milihenry(mH)","1000");
        return Inductance.get(Unit);
    }
    public static String Magnetic_Flux(String Unit){
        HashMap<String, String> Magnetic_Flux =new HashMap<>();
        Magnetic_Flux.put("Weber(Wb)","1");
        Magnetic_Flux.put("Maxwell(Mx)","100000000");
        return Magnetic_Flux.get(Unit);
    }
    public static String Magnetic_Field(String Unit){
        HashMap<String, String> Magnetic_Field =new HashMap<>();
        Magnetic_Field.put("Tesla(T)","1");
        Magnetic_Field.put("Gauss(Gs)","10000");
        Magnetic_Field.put("Miligauss(mGs)","10000000");
        return Magnetic_Field.get(Unit);
    }
    public static String Luminous_Flux(String Unit){
        HashMap<String, String> Luminous_Flux =new HashMap<>();
        Luminous_Flux.put("Lumen(lm)","1");
        Luminous_Flux.put("Candlepower","12.5664");
        return Luminous_Flux.get(Unit);
    }
    public static String Light_Intensity(String Unit){
        HashMap<String, String> Light_Intensity = new HashMap<>();
        Light_Intensity.put("Candela(cd)","1");
        Light_Intensity.put("Lumen for steradian(lm/sr)","1");
        Light_Intensity.put("Hefnerkerze","1.11");

        return Light_Intensity.get(Unit);
    }
    public static String Illuminance(String Unit){
        HashMap<String, String> Illuminance = new HashMap<>();
        Illuminance.put("Lux(lx)","1");
        Illuminance.put("lm/ft²","0.092678405931418");
        Illuminance.put("phot(ph)","0.0001");
        Illuminance.put("foot-candle(fc)","0.0929");
        Illuminance.put("meter-candle","1");
        return Illuminance.get(Unit);
    }

    public static String Frequency(String Unit){
        HashMap<String, String> Frequency = new HashMap<>();
        Frequency.put("Hertz(Hz)","1");
        Frequency.put("Fresnel","1000000000000");
        Frequency.put("Kilohertz(kHz)","1000");
        Frequency.put("Megahertz(MHz)","1000000");
        Frequency.put("Gigahertz(GHz)","1000000000");
        return Frequency.get(Unit);
    }
    public static String Intensity_Level(String Unit){
        HashMap<String, String> Intensity_Level = new HashMap<>();
        Intensity_Level.put("Decibel(dB)","1");
        Intensity_Level.put("Bel(B)","10");
        Intensity_Level.put("Neper(NP)","8.68589");
        return Intensity_Level.get(Unit);
    }
    public static String Radiation(String Unit){
        HashMap<String, String> Radiation = new HashMap<>();
        Radiation.put("rad","1");
        Radiation.put("gray(Gy)","0.01");
        Radiation.put("centigray(cGy)","1");
        Radiation.put("miligray(mGy)","10");
        Radiation.put("microgray(µGy)","10000");
        Radiation.put("microroentgen(µR)","1150000");
        Radiation.put("miliroentgen(mR)","1150");
        Radiation.put("Roentgen(R)","1.14");
        Radiation.put("milliculombio for kilogram (mC/kg)","0.2942");
        Radiation.put("culombio por kilogramo (C/kg)","0.0002942");
        Radiation.put("microsievert(µSv)","10000");
        Radiation.put("milirem","1000");
        Radiation.put("milisievert (mSv)","10");
        Radiation.put("rem","1");
        Radiation.put("sievert (Sv)","0.01");
        return Radiation.get(Unit);
    }
    public static String Radioactivity(String Unit){
        HashMap<String, String> Radioactivity = new HashMap<>();
        Radioactivity.put("becquerel(Bq)","1");
        Radioactivity.put("kilobecquerel (kBq)","0.001");
        Radioactivity.put("megabecquerel (MBq)","0.000001");
        Radioactivity.put("microcurio (µCi)","0.00002703");
        Radioactivity.put("milicurio (mCi)","0.00000002703");
        Radioactivity.put("rutherford (rd)","0.000001");
        Radioactivity.put("curio (Ci)","0.00000000002703");
        return Radioactivity.get(Unit);
    }
        public static double FaC(String F){
            double C = (5*(Double.parseDouble(F)-32))/9;
            return redondearDecimales(C,2);
        }
        public static double CaF(String C){
            double F = (9*Double.parseDouble(C)/5)+32;
            return redondearDecimales(F,2);
        }
        public static double KaC(String K){
            double C = Double.parseDouble(K) - 273.15;
            return redondearDecimales(C,2);
        }
        public static double CaK(String C){
            double K = Double.parseDouble(C) + 273.15;
            return redondearDecimales(K,2);
        }
        public static double KaF(String K){
            double F = (9*(Double.parseDouble(K)-273.15)/5)+32;
            return redondearDecimales(F,2);
        }
        public static double FaK(String F){
            double K = 5*(Double.parseDouble(F)-32)/9 + 273.15;
            return redondearDecimales(K,2);
        }
        public static double RaaF(String Ra){
            double F = Double.parseDouble(Ra)-459.67;
            return redondearDecimales(F,2);
        }
        public static double FaRa(String F){
            double Ra = Double.parseDouble(F)+459.67;
            return redondearDecimales(Ra,2);
        }
        public static double ReaC(String Re){
            double C = 5*Double.parseDouble(Re)/4;
            return redondearDecimales(C,2);
        }
        public static double RaaK(String Ra){
            double K = 5*(Double.parseDouble(Ra)-491.67)/9 + 273.15;
            return redondearDecimales(K,2);
        }
        public static double RaaC(String Ra){
            double C = 5*(Double.parseDouble(Ra)-491.67)/9;
            return redondearDecimales(C,2);
        }
        public static double CaRa(String C){
            double Ra = 9*Double.parseDouble(C)/5 + 491.67;
            return redondearDecimales(Ra,2);
        }
        public static double CaRe(String C){
            double Re = 4*Double.parseDouble(C)/5;
            return redondearDecimales(Re,2);
        }
        public static double KaRa(String K){
            double Ra = (9*(Double.parseDouble(K)-273.15))/5 + 491.67;
            return redondearDecimales(Ra,2);
        }
        public static double FaRe(String F){
            double Re = 4*(Double.parseDouble(F)-32)/9;
            return redondearDecimales(Re,2);
        }
        public static double ReaF(String Re){
            double F = 9*Double.parseDouble(Re)/4 + 32;
            return redondearDecimales(F,2);
        }
        public static double KaRe(String K){
            double Re = 4*(Double.parseDouble(K)-273.15)/5;
            return redondearDecimales(Re,2);
        }
        public static double ReaK(String Re){
            double K = 5*Double.parseDouble(Re)/4 + 273.15;
            return redondearDecimales(K,2);
        }
        public static double RaaRe(String Ra){
            double Re = 4*(Double.parseDouble(Ra)-491.67)/9;
            return redondearDecimales(Re,2);
        }
        public static double ReaRa(String Re){
            double Ra = 9*Double.parseDouble(Re)/4 + 491.67;
            return redondearDecimales(Ra,2);
        }
    public static double redondearDecimales(double valorInicial, int numeroDecimales) {
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado=(resultado-parteEntera)*Math.pow(10, numeroDecimales);
        resultado=Math.round(resultado);
        resultado=(resultado/Math.pow(10, numeroDecimales))+parteEntera;
        return resultado;
    }
    public static String convert(String type, String UI, String UF, String value)  {
        String conve = null;
        try {
        if(type == "Lenght") {
            double conv = (Double.parseDouble(Lenght(UF)) * Double.parseDouble(value))/Double.parseDouble(Lenght(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Area") {
            double conv = (Double.parseDouble(Area(UF)) * Double.parseDouble(value))/Double.parseDouble(Area(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Volume"){
            double conv = (Double.parseDouble(Volume(UF)) * Double.parseDouble(value))/Double.parseDouble(Volume(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Angle"){
            double conv = (Double.parseDouble(Angle(UF)) * Double.parseDouble(value))/Double.parseDouble(Angle(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Speed"){
            double conv = (Double.parseDouble(Speed(UF)) * Double.parseDouble(value))/Double.parseDouble(Speed(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Angular_Velocity"){
            double conv = (Double.parseDouble(Angular_Velocity(UF)) * Double.parseDouble(value))/Double.parseDouble(Angular_Velocity(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Acceleration"){
            double conv = (Double.parseDouble(Acceleration(UF)) * Double.parseDouble(value))/Double.parseDouble(Acceleration(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Mass"){
            double conv = (Double.parseDouble(Mass(UF)) * Double.parseDouble(value))/Double.parseDouble(Mass(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Flow_Liquid"){
            double conv = (Double.parseDouble(Flow_Liquid(UF)) * Double.parseDouble(value))/Double.parseDouble(Flow_Liquid(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Flow_Mass"){
            double conv = (Double.parseDouble(Flow_Mass(UF)) * Double.parseDouble(value))/Double.parseDouble(Flow_Mass(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Density"){
            double conv = (Double.parseDouble(Density(UF)) * Double.parseDouble(value))/Double.parseDouble(Density(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Force"){
            double conv = (Double.parseDouble(Force(UF)) * Double.parseDouble(value))/Double.parseDouble(Force(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Specific_Weight"){
            double conv = (Double.parseDouble(Specific_Weight(UF)) * Double.parseDouble(value))/Double.parseDouble(Specific_Weight(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Pressure"){
            double conv = (Double.parseDouble(Pressure(UF)) * Double.parseDouble(value))/Double.parseDouble(Pressure(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Kinematic_Viscosity"){
            double conv = (Double.parseDouble(Kinematic_Viscosity(UF)) * Double.parseDouble(value))/Double.parseDouble(Kinematic_Viscosity(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Dynamic_Viscosity"){
            double conv = (Double.parseDouble(Dynamic_Viscosity(UF)) * Double.parseDouble(value))/Double.parseDouble(Dynamic_Viscosity(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Torque"){
            double conv = (Double.parseDouble(Torque(UF)) * Double.parseDouble(value))/Double.parseDouble(Torque(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Energy_Work"){
            double conv = (Double.parseDouble(Energy_Work(UF)) * Double.parseDouble(value))/Double.parseDouble(Energy_Work(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Power"){
            double conv = (Double.parseDouble(Power(UF)) * Double.parseDouble(value))/Double.parseDouble(Power(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Temperature"){
            if (UI == "Kelvin(K)"){
                if(UF == "Celsius(°C)"){
                    double conv = KaC(value);
                    conve =  String.valueOf(conv);
                }
                else if(UF == "Fahrenheit(°F)"){
                    double conv = KaF(value);
                    conve = String.valueOf(conv);
                }
                else if(UF == "Réaumur(°R)"){
                    double conv = KaRe(value);
                    conve = String.valueOf(conv);
                }
                else if(UF == "Rankine(R)"){
                    double conv = KaRa(value);
                    conve = String.valueOf(conv);
                }
                else{
                    conve = value;
                }
            }
            else if(UI == "Celsius(°C)"){
                if(UF == "Kelvin(K)"){
                    double conv = CaK(value);
                    conve =  String.valueOf(conv);
                }
                else if(UF == "Fahrenheit(°F)"){
                    double conv = CaF(value);
                    conve = String.valueOf(conv);
                }
                else if(UF == "Réaumur(°R)"){
                    double conv = CaRe(value);
                    conve = String.valueOf(conv);
                }
                else if(UF == "Rankine(R)"){
                    double conv = CaRa(value);
                    conve = String.valueOf(conv);
                }
                else{
                    conve = value;
                }
            }
            else if(UI == "Fahrenheit(°F)"){
                if(UF == "Kelvin(K)"){
                    double conv = FaK(value);
                    conve =  String.valueOf(conv);
                }
                else if(UF == "Celsius(°C)"){
                    double conv = FaC(value);
                    conve = String.valueOf(conv);
                }
                else if(UF == "Réaumur(°R)"){
                    double conv = FaRe(value);
                    conve = String.valueOf(conv);
                }
                else if(UF == "Rankine(R)"){
                    double conv = FaRa(value);
                    conve = String.valueOf(conv);
                }
                else{
                    conve = value;
                }
            }
            else if(UI == "Réaumur(°R)"){
                if(UF == "Kelvin(K)"){
                    double conv = ReaK(value);
                    conve =  String.valueOf(conv);
                }
                else if(UF == "Celsius(°C)"){
                    double conv = ReaC(value);
                    conve = String.valueOf(conv);
                }
                else if(UF == "Fahrenheit(°F)"){
                    double conv = ReaF(value);
                    conve = String.valueOf(conv);
                }
                else if(UF == "Rankine(R)"){
                    double conv = ReaRa(value);
                    conve = String.valueOf(conv);
                }
                else{
                    conve = value;
                }
            }
            else if(UI == "Rankine(R)"){
                if(UF == "Kelvin(K)"){
                    double conv = RaaK(value);
                    conve =  String.valueOf(conv);
                }
                else if(UF == "Celsius(°C)"){
                    double conv = RaaC(value);
                    conve = String.valueOf(conv);
                }
                else if(UF == "Fahrenheit(°F)"){
                    double conv = RaaF(value);
                    conve = String.valueOf(conv);
                }
                else if(UF == "Réaumur(°R)"){
                    double conv = RaaRe(value);
                    conve = String.valueOf(conv);
                }
                else{
                    conve = value;
                }
            }
        }
        else if(type == "Electric_Charge"){
            double conv = (Double.parseDouble(Electric_Charge(UF)) * Double.parseDouble(value))/Double.parseDouble(Electric_Charge(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Electric_Current"){
            double conv = (Double.parseDouble(Electric_Current(UF)) * Double.parseDouble(value))/Double.parseDouble(Electric_Current(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Voltage_Electromotive_Force_Electric_Power"){
            double conv = (Double.parseDouble(Voltage_Electromotive_Force_Electric_Power(UF)) * Double.parseDouble(value))/Double.parseDouble(Voltage_Electromotive_Force_Electric_Power(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Electric_Resistance"){
            double conv = (Double.parseDouble(Electric_Resistance(UF)) * Double.parseDouble(value))/Double.parseDouble(Electric_Resistance(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Capacitance"){
            double conv = (Double.parseDouble(Capacitance(UF)) * Double.parseDouble(value))/Double.parseDouble(Capacitance(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Inductance"){
            double conv = (Double.parseDouble(Inductance(UF)) * Double.parseDouble(value))/Double.parseDouble(Inductance(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Magnetic_Flux"){
            double conv = (Double.parseDouble(Magnetic_Flux(UF)) * Double.parseDouble(value))/Double.parseDouble(Magnetic_Flux(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Magnetic_Field"){
            double conv = (Double.parseDouble(Magnetic_Field(UF)) * Double.parseDouble(value))/Double.parseDouble(Magnetic_Field(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Luminous_Flux"){
            double conv = (Double.parseDouble(Luminous_Flux(UF)) * Double.parseDouble(value))/Double.parseDouble(Luminous_Flux(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Light_Intensity"){
            double conv = (Double.parseDouble(Light_Intensity(UF)) * Double.parseDouble(value))/Double.parseDouble(Light_Intensity(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Illuminance"){
            double conv = (Double.parseDouble(Illuminance(UF)) * Double.parseDouble(value))/Double.parseDouble(Illuminance(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Frequency"){
            double conv = (Double.parseDouble(Frequency(UF)) * Double.parseDouble(value))/Double.parseDouble(Frequency(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Intensity_Level"){
            double conv = (Double.parseDouble(Intensity_Level(UF)) * Double.parseDouble(value))/Double.parseDouble(Intensity_Level(UI));
            conve =  String.valueOf(conv);
        }
        else if(type == "Radiation"){
            double conv = (Double.parseDouble(Radiation(UF)) * Double.parseDouble(value))/Double.parseDouble(Radiation(UI));
            conve =  String.valueOf(conv);
        }
        else {
            double conv = (Double.parseDouble(Radioactivity(UF)) * Double.parseDouble(value))/Double.parseDouble(Radioactivity(UI));
            conve =  String.valueOf(conv);
        }
        return conve;
        }   catch (Exception e) {
            return "Error: Only numbers";
        }
    }
//}


    
    public static void main(String[] args) {
        // TODO code application logic here
       
       System.out.println(convert("Temperature","Kelvin(K)","Celsius(°C)","25" ));
       System.out.println(convert("Mass","gram","Kg","231"));
        
    }
    
}
