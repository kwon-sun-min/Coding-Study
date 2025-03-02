import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Solution_Kit25 
{
  public int solution(String word)
  {
    String[] words = new String[] {"A", "AA", "AE", "AI", "AO", "AU", 
    "AAA", "AAE", "AAI", "AAO", "AAU",
    "AEA", "AEE", "AEI", "AEO", "AEU",
    "AIA", "AIE", "AII", "AIO", "AIU",
    "AOA", "AOE", "AOI", "AOO", "AOU", 
    "AUA", "AUE", "AUI", "AUO", "AUU",
    "AAAA", "AAAE", "AAAI", "AAAO", "AAAU",
    "AAEA", "AAEE", "AAEI", "AAEO", "AAEU",
    "AAIA", "AAIE", "AAII", "AAIO", "AAIU",
    "AAOA", "AAOE", "AAOI", "AAOO", "AAOU", 
    "AAUA", "AAUE", "AAUI", "AAUO", "AAUU",
    "AEAA", "AEAE", "AEAI", "AEAO", "AEAU", 
    "AEEA", "AEEE", "AEEI", "AEEO", "AEEU",
    "AEIA", "AEIE", "AEII", "AEIO", "AEIU",
    "AEOA", "AEOE", "AEOI", "AEOO", "AEOU", 
    "AEUA", "AEUE", "AEUI", "AEUO", "AEUU",
    "AIAA", "AIAE", "AIAI", "AIAO", "AIAU", 
    "AIEA", "AIEE", "AIEI", "AIEO", "AIEU",
    "AIIA", "AIIE", "AIII", "AIIO", "AIIU",
    "AIOA", "AIOE", "AIOI", "AIOO", "AIOU", 
    "AIUA", "AIUE", "AIUI", "AIUO", "AIUU",
    "AOAA", "AOAE", "AOAI", "AOAO", "AOAU", 
    "AOEA", "AOEE", "AOEI", "AOEO", "AOEU",
    "AOIA", "AOIE", "AOII", "AOIO", "AOIU",
    "AOOA", "AOOE", "AOOI", "AOOO", "AOOU", 
    "AOUA", "AOUE", "AOUI", "AOUO", "AOUU",
    "AUAA", "AUAE", "AUAI", "AUAO", "AUAU", 
    "AUEA", "AUEE", "AUEI", "AUEO", "AUEU",
    "AUIA", "AUIE", "AUII", "AUIO", "AUIU",
    "AUOA", "AUOE", "AUOI", "AUOO", "AUOU", 
    "AUUA", "AUUE", "AUUI", "AUUO", "AUUU",
    "AAAAA", "AAAAE", "AAAAI", "AAAAO", "AAAAU",
    "AAAEA", "AAAEE", "AAAEI", "AAAEO", "AAAEU",
    "AAAIA", "AAAIE", "AAAII", "AAAIO", "AAAIU",
    "AAAOA", "AAAOE", "AAAOI", "AAAOO", "AAAOU", 
    "AAAUA", "AAAUE", "AAAUI", "AAAUO", "AAAUU",
    "AAEAA", "AAEAE", "AAEAI", "AAEAO", "AAEAU", 
    "AAEEA", "AAEEE", "AAEEI", "AAEEO", "AAEEU",
    "AAEIA", "AAEIE", "AAEII", "AAEIO", "AAEIU",
    "AAEOA", "AAEOE", "AAEOI", "AAEOO", "AAEOU", 
    "AAEUA", "AAEUE", "AAEUI", "AAEUO", "AAEUU",
    "AAIAA", "AAIAE", "AAIAI", "AAIAO", "AAIAU", 
    "AAIEA", "AAIEE", "AAIEI", "AAIEO", "AAIEU",
    "AAIIA", "AAIIE", "AAIII", "AAIIO", "AAIIU",
    "AAIOA", "AAIOE", "AAIOI", "AAIOO", "AAIOU", 
    "AAIUA", "AAIUE", "AAIUI", "AAIUO", "AAIUU",
    "AAOAA", "AAOAE", "AAOAI", "AAOAO", "AAOAU", 
    "AAOEA", "AAOEE", "AAOEI", "AAOEO", "AAOEU",
    "AAOIA", "AAOIE", "AAOII", "AAOIO", "AAOIU",
    "AAOOA", "AAOOE", "AAOOI", "AAOOO", "AAOOU", 
    "AAOUA", "AAOUE", "AAOUI", "AAOUO", "AAOUU",
    "AAUAA", "AAUAE", "AAUAI", "AAUAO", "AAUAU", 
    "AAUEA", "AAUEE", "AAUEI", "AAUEO", "AAUEU",
    "AAUIA", "AAUIE", "AAUII", "AAUIO", "AAUIU",
    "AAUOA", "AAUOE", "AAUOI", "AAUOO", "AAUOU", 
    "AAUUA", "AAUUE", "AAUUI", "AAUUO", "AAUUU",
    "AEAAA", "AEAAE", "AEAAI", "AEAAO", "AEAAU",
    "AEAEA", "AEAEE", "AEAEI", "AEAEO", "AEAEU",
    "AEAIA", "AEAIE", "AEAII", "AEAIO", "AEAIU",
    "AEAOA", "AEAOE", "AEAOI", "AEAOO", "AEAOU", 
    "AEAUA", "AEAUE", "AEAUI", "AEAUO", "AEAUU",
    "AEEAA", "AEEAE", "AEEAI", "AEEAO", "AEEAU", 
    "AEEEA", "AEEEE", "AEEEI", "AEEEO", "AEEEU",
    "AEEIA", "AEEIE", "AEEII", "AEEIO", "AEEIU",
    "AEEOA", "AEEOE", "AEEOI", "AEEOO", "AEEOU", 
    "AEEUA", "AEEUE", "AEEUI", "AEEUO", "AEEUU",
    "AEIAA", "AEIAE", "AEIAI", "AEIAO", "AEIAU", 
    "AEIEA", "AEIEE", "AEIEI", "AEIEO", "AEIEU",
    "AEIIA", "AEIIE", "AEIII", "AEIIO", "AEIIU",
    "AEIOA", "AEIOE", "AEIOI", "AEIOO", "AEIOU", 
    "AEIUA", "AEIUE", "AEIUI", "AEIUO", "AEIUU",
    "AEOAA", "AEOAE", "AEOAI", "AEOAO", "AEOAU", 
    "AEOEA", "AEOEE", "AEOEI", "AEOEO", "AEOEU",
    "AEOIA", "AEOIE", "AEOII", "AEOIO", "AEOIU",
    "AEOOA", "AEOOE", "AEOOI", "AEOOO", "AEOOU", 
    "AEOUA", "AEOUE", "AEOUI", "AEOUO", "AEOUU",
    "AEUAA", "AEUAE", "AEUAI", "AEUAO", "AEUAU", 
    "AEUEA", "AEUEE", "AEUEI", "AEUEO", "AEUEU",
    "AEUIA", "AEUIE", "AEUII", "AEUIO", "AEUIU",
    "AEUOA", "AEUOE", "AEUOI", "AEUOO", "AEUOU", 
    "AEUUA", "AEUUE", "AEUUI", "AEUUO", "AEUUU",
    "AIAAA", "AIAAE", "AIAAI", "AIAAO", "AIAAU",
    "AIAEA", "AIAEE", "AIAEI", "AIAEO", "AIAEU",
    "AIAIA", "AIAIE", "AIAII", "AIAIO", "AIAIU",
    "AIAOA", "AIAOE", "AIAOI", "AIAOO", "AIAOU", 
    "AIAUA", "AIAUE", "AIAUI", "AIAUO", "AIAUU",
    "AIEAA", "AIEAE", "AIEAI", "AIEAO", "AIEAU", 
    "AIEEA", "AIEEE", "AIEEI", "AIEEO", "AIEEU",
    "AIEIA", "AIEIE", "AIEII", "AIEIO", "AIEIU",
    "AIEOA", "AIEOE", "AIEOI", "AIEOO", "AIEOU", 
    "AIEUA", "AIEUE", "AIEUI", "AIEUO", "AIEUU",
    "AIIAA", "AIIAE", "AIIAI", "AIIAO", "AIIAU", 
    "AIIEA", "AIIEE", "AIIEI", "AIIEO", "AIIEU",
    "AIIIA", "AIIIE", "AIIII", "AIIIO", "AIIIU",
    "AIIOA", "AIIOE", "AIIOI", "AIIOO", "AIIOU", 
    "AIIUA", "AIIUE", "AIIUI", "AIIUO", "AIIUU",
    "AIOAA", "AIOAE", "AIOAI", "AIOAO", "AIOAU", 
    "AIOEA", "AIOEE", "AIOEI", "AIOEO", "AIOEU",
    "AIOIA", "AIOIE", "AIOII", "AIOIO", "AIOIU",
    "AIOOA", "AIOOE", "AIOOI", "AIOOO", "AIOOU", 
    "AIOUA", "AIOUE", "AIOUI", "AIOUO", "AIOUU",
    "AIUAA", "AIUAE", "AIUAI", "AIUAO", "AIUAU", 
    "AIUEA", "AIUEE", "AIUEI", "AIUEO", "AIUEU",
    "AIUIA", "AIUIE", "AIUII", "AIUIO", "AIUIU",
    "AIUOA", "AIUOE", "AIUOI", "AIUOO", "AIUOU", 
    "AIUUA", "AIUUE", "AIUUI", "AIUUO", "AIUUU",
    "AOAAA", "AOAAE", "AOAAI", "AOAAO", "AOAAU",
    "AOAEA", "AOAEE", "AOAEI", "AOAEO", "AOAEU",
    "AOAIA", "AOAIE", "AOAII", "AOAIO", "AOAIU",
    "AOAOA", "AOAOE", "AOAOI", "AOAOO", "AOAOU", 
    "AOAUA", "AOAUE", "AOAUI", "AOAUO", "AOAUU",
    "AOEAA", "AOEAE", "AOEAI", "AOEAO", "AOEAU", 
    "AOEEA", "AOEEE", "AOEEI", "AOEEO", "AOEEU",
    "AOEIA", "AOEIE", "AOEII", "AOEIO", "AOEIU",
    "AOEOA", "AOEOE", "AOEOI", "AOEOO", "AOEOU", 
    "AOEUA", "AOEUE", "AOEUI", "AOEUO", "AOEUU",
    "AOIAA", "AOIAE", "AOIAI", "AOIAO", "AOIAU", 
    "AOIEA", "AOIEE", "AOIEI", "AOIEO", "AOIEU",
    "AOIIA", "AOIIE", "AOIII", "AOIIO", "AOIIU",
    "AOIOA", "AOIOE", "AOIOI", "AOIOO", "AOIOU", 
    "AOIUA", "AOIUE", "AOIUI", "AOIUO", "AOIUU",
    "AOOAA", "AOOAE", "AOOAI", "AOOAO", "AOOAU", 
    "AOOEA", "AOOEE", "AOOEI", "AOOEO", "AOOEU",
    "AOOIA", "AOOIE", "AOOII", "AOOIO", "AOOIU",
    "AOOOA", "AOOOE", "AOOOI", "AOOOO", "AOOOU", 
    "AOOUA", "AOOUE", "AOOUI", "AOOUO", "AOOUU",
    "AOUAA", "AOUAE", "AOUAI", "AOUAO", "AOUAU", 
    "AOUEA", "AOUEE", "AOUEI", "AOUEO", "AOUEU",
    "AOUIA", "AOUIE", "AOUII", "AOUIO", "AOUIU",
    "AOUOA", "AOUOE", "AOUOI", "AOUOO", "AOUOU", 
    "AOUUA", "AOUUE", "AOUUI", "AOUUO", "AOUUU",
    "AUAAA", "AUAAE", "AUAAI", "AUAAO", "AUAAU",
    "AUAEA", "AUAEE", "AUAEI", "AUAEO", "AUAEU",
    "AUAIA", "AUAIE", "AUAII", "AUAIO", "AUAIU",
    "AUAOA", "AUAOE", "AUAOI", "AUAOO", "AUAOU", 
    "AUAUA", "AUAUE", "AUAUI", "AUAUO", "AUAUU",
    "AUEAA", "AUEAE", "AUEAI", "AUEAO", "AUEAU", 
    "AUEEA", "AUEEE", "AUEEI", "AUEEO", "AUEEU",
    "AUEIA", "AUEIE", "AUEII", "AUEIO", "AUEIU",
    "AUEOA", "AUEOE", "AUEOI", "AUEOO", "AUEOU", 
    "AUEUA", "AUEUE", "AUEUI", "AUEUO", "AUEUU",
    "AUIAA", "AUIAE", "AUIAI", "AUIAO", "AUIAU", 
    "AUIEA", "AUIEE", "AUIEI", "AUIEO", "AUIEU",
    "AUIIA", "AUIIE", "AUIII", "AUIIO", "AUIIU",
    "AUIOA", "AUIOE", "AUIOI", "AUIOO", "AUIOU", 
    "AUIUA", "AUIUE", "AUIUI", "AUIUO", "AUIUU",
    "AUOAA", "AUOAE", "AUOAI", "AUOAO", "AUOAU", 
    "AUOEA", "AUOEE", "AUOEI", "AUOEO", "AUOEU",
    "AUOIA", "AUOIE", "AUOII", "AUOIO", "AUOIU",
    "AUOOA", "AUOOE", "AUOOI", "AUOOO", "AUOOU", 
    "AUOUA", "AUOUE", "AUOUI", "AUOUO", "AUOUU",
    "AUUAA", "AUUAE", "AUUAI", "AUUAO", "AUUAU", 
    "AUUEA", "AUUEE", "AUUEI", "AUUEO", "AUUEU",
    "AUUIA", "AUUIE", "AUUII", "AUUIO", "AUUIU",
    "AUUOA", "AUUOE", "AUUOI", "AUUOO", "AUUOU", 
    "AUUUA", "AUUUE", "AUUUI", "AUUUO", "AUUUU",
    "E", "EA", "EE", "EI", "EO", "EU",
    "EAA", "EAE", "EAI", "EAO", "EAU", 
    "EEA", "EEE", "EEI", "EEO", "EEU",
    "EIA", "EIE", "EII", "EIO", "EIU",
    "EOA", "EOE", "EOI", "EOO", "EOU", 
    "EUA", "EUE", "EUI", "EUO", "EUU",
    "EAAA", "EAAE", "EAAI", "EAAO", "EAAU",
    "EAEA", "EAEE", "EAEI", "EAEO", "EAEU",
    "EAIA", "EAIE", "EAII", "EAIO", "EAIU",
    "EAOA", "EAOE", "EAOI", "EAOO", "EAOU", 
    "EAUA", "EAUE", "EAUI", "EAUO", "EAUU",
    "EEAA", "EEAE", "EEAI", "EEAO", "EEAU", 
    "EEEA", "EEEE", "EEEI", "EEEO", "EEEU",
    "EEIA", "EEIE", "EEII", "EEIO", "EEIU",
    "EEOA", "EEOE", "EEOI", "EEOO", "EEOU", 
    "EEUA", "EEUE", "EEUI", "EEUO", "EEUU",
    "EIAA", "EIAE", "EIAI", "EIAO", "EIAU", 
    "EIEA", "EIEE", "EIEI", "EIEO", "EIEU",
    "EIIA", "EIIE", "EIII", "EIIO", "EIIU",
    "EIOA", "EIOE", "EIOI", "EIOO", "EIOU", 
    "EIUA", "EIUE", "EIUI", "EIUO", "EIUU",
    "EOAA", "EOAE", "EOAI", "EOAO", "EOAU", 
    "EOEA", "EOEE", "EOEI", "EOEO", "EOEU",
    "EOIA", "EOIE", "EOII", "EOIO", "EOIU",
    "EOOA", "EOOE", "EOOI", "EOOO", "EOOU", 
    "EOUA", "EOUE", "EOUI", "EOUO", "EOUU",
    "EUAA", "EUAE", "EUAI", "EUAO", "EUAU", 
    "EUEA", "EUEE", "EUEI", "EUEO", "EUEU",
    "EUIA", "EUIE", "EUII", "EUIO", "EUIU",
    "EUOA", "EUOE", "EUOI", "EUOO", "EUOU", 
    "EUUA", "EUUE", "EUUI", "EUUO", "EUUU",
    "EAAAA", "EAAAE", "EAAAI", "EAAAO", "EAAAU",
    "EAAEA", "EAAEE", "EAAEI", "EAAEO", "EAAEU",
    "EAAIA", "EAAIE", "EAAII", "EAAIO", "EAAIU",
    "EAAOA", "EAAOE", "EAAOI", "EAAOO", "EAAOU", 
    "EAAUA", "EAAUE", "EAAUI", "EAAUO", "EAAUU",
    "EAEAA", "EAEAE", "EAEAI", "EAEAO", "EAEAU", 
    "EAEEA", "EAEEE", "EAEEI", "EAEEO", "EAEEU",
    "EAEIA", "EAEIE", "EAEII", "EAEIO", "EAEIU",
    "EAEOA", "EAEOE", "EAEOI", "EAEOO", "EAEOU", 
    "EAEUA", "EAEUE", "EAEUI", "EAEUO", "EAEUU",
    "EAIAA", "EAIAE", "EAIAI", "EAIAO", "EAIAU", 
    "EAIEA", "EAIEE", "EAIEI", "EAIEO", "EAIEU",
    "EAIIA", "EAIIE", "EAIII", "EAIIO", "EAIIU",
    "EAIOA", "EAIOE", "EAIOI", "EAIOO", "EAIOU", 
    "EAIUA", "EAIUE", "EAIUI", "EAIUO", "EAIUU",
    "EAOAA", "EAOAE", "EAOAI", "EAOAO", "EAOAU", 
    "EAOEA", "EAOEE", "EAOEI", "EAOEO", "EAOEU",
    "EAOIA", "EAOIE", "EAOII", "EAOIO", "EAOIU",
    "EAOOA", "EAOOE", "EAOOI", "EAOOO", "EAOOU", 
    "EAOUA", "EAOUE", "EAOUI", "EAOUO", "EAOUU",
    "EAUAA", "EAUAE", "EAUAI", "EAUAO", "EAUAU", 
    "EAUEA", "EAUEE", "EAUEI", "EAUEO", "EAUEU",
    "EAUIA", "EAUIE", "EAUII", "EAUIO", "EAUIU",
    "EAUOA", "EAUOE", "EAUOI", "EAUOO", "EAUOU", 
    "EAUUA", "EAUUE", "EAUUI", "EAUUO", "EAUUU",
    "EEAAA", "EEAAE", "EEAAI", "EEAAO", "EEAAU",
    "EEAEA", "EEAEE", "EEAEI", "EEAEO", "EEAEU",
    "EEAIA", "EEAIE", "EEAII", "EEAIO", "EEAIU",
    "EEAOA", "EEAOE", "EEAOI", "EEAOO", "EEAOU", 
    "EEAUA", "EEAUE", "EEAUI", "EEAUO", "EEAUU",
    "EEEAA", "EEEAE", "EEEAI", "EEEAO", "EEEAU", 
    "EEEEA", "EEEEE", "EEEEI", "EEEEO", "EEEEU",
    "EEEIA", "EEEIE", "EEEII", "EEEIO", "EEEIU",
    "EEEOA", "EEEOE", "EEEOI", "EEEOO", "EEEOU", 
    "EEEUA", "EEEUE", "EEEUI", "EEEUO", "EEEUU",
    "EEIAA", "EEIAE", "EEIAI", "EEIAO", "EEIAU", 
    "EEIEA", "EEIEE", "EEIEI", "EEIEO", "EEIEU",
    "EEIIA", "EEIIE", "EEIII", "EEIIO", "EEIIU",
    "EEIOA", "EEIOE", "EEIOI", "EEIOO", "EEIOU", 
    "EEIUA", "EEIUE", "EEIUI", "EEIUO", "EEIUU",
    "EEOAA", "EEOAE", "EEOAI", "EEOAO", "EEOAU", 
    "EEOEA", "EEOEE", "EEOEI", "EEOEO", "EEOEU",
    "EEOIA", "EEOIE", "EEOII", "EEOIO", "EEOIU",
    "EEOOA", "EEOOE", "EEOOI", "EEOOO", "EEOOU", 
    "EEOUA", "EEOUE", "EEOUI", "EEOUO", "EEOUU",
    "EEUAA", "EEUAE", "EEUAI", "EEUAO", "EEUAU", 
    "EEUEA", "EEUEE", "EEUEI", "EEUEO", "EEUEU",
    "EEUIA", "EEUIE", "EEUII", "EEUIO", "EEUIU",
    "EEUOA", "EEUOE", "EEUOI", "EEUOO", "EEUOU", 
    "EEUUA", "EEUUE", "EEUUI", "EEUUO", "EEUUU",
    "EIAAA", "EIAAE", "EIAAI", "EIAAO", "EIAAU",
    "EIAEA", "EIAEE", "EIAEI", "EIAEO", "EIAEU",
    "EIAIA", "EIAIE", "EIAII", "EIAIO", "EIAIU",
    "EIAOA", "EIAOE", "EIAOI", "EIAOO", "EIAOU", 
    "EIAUA", "EIAUE", "EIAUI", "EIAUO", "EIAUU",
    "EIEAA", "EIEAE", "EIEAI", "EIEAO", "EIEAU", 
    "EIEEA", "EIEEE", "EIEEI", "EIEEO", "EIEEU",
    "EIEIA", "EIEIE", "EIEII", "EIEIO", "EIEIU",
    "EIEOA", "EIEOE", "EIEOI", "EIEOO", "EIEOU", 
    "EIEUA", "EIEUE", "EIEUI", "EIEUO", "EIEUU",
    "EIIAA", "EIIAE", "EIIAI", "EIIAO", "EIIAU", 
    "EIIEA", "EIIEE", "EIIEI", "EIIEO", "EIIEU",
    "EIIIA", "EIIIE", "EIIII", "EIIIO", "EIIIU",
    "EIIOA", "EIIOE", "EIIOI", "EIIOO", "EIIOU", 
    "EIIUA", "EIIUE", "EIIUI", "EIIUO", "EIIUU",
    "EIOAA", "EIOAE", "EIOAI", "EIOAO", "EIOAU", 
    "EIOEA", "EIOEE", "EIOEI", "EIOEO", "EIOEU",
    "EIOIA", "EIOIE", "EIOII", "EIOIO", "EIOIU",
    "EIOOA", "EIOOE", "EIOOI", "EIOOO", "EIOOU", 
    "EIOUA", "EIOUE", "EIOUI", "EIOUO", "EIOUU",
    "EIUAA", "EIUAE", "EIUAI", "EIUAO", "EIUAU", 
    "EIUEA", "EIUEE", "EIUEI", "EIUEO", "EIUEU",
    "EIUIA", "EIUIE", "EIUII", "EIUIO", "EIUIU",
    "EIUOA", "EIUOE", "EIUOI", "EIUOO", "EIUOU", 
    "EIUUA", "EIUUE", "EIUUI", "EIUUO", "EIUUU",
    "EOAAA", "EOAAE", "EOAAI", "EOAAO", "EOAAU",
    "EOAEA", "EOAEE", "EOAEI", "EOAEO", "EOAEU",
    "EOAIA", "EOAIE", "EOAII", "EOAIO", "EOAIU",
    "EOAOA", "EOAOE", "EOAOI", "EOAOO", "EOAOU", 
    "EOAUA", "EOAUE", "EOAUI", "EOAUO", "EOAUU",
    "EOEAA", "EOEAE", "EOEAI", "EOEAO", "EOEAU", 
    "EOEEA", "EOEEE", "EOEEI", "EOEEO", "EOEEU",
    "EOEIA", "EOEIE", "EOEII", "EOEIO", "EOEIU",
    "EOEOA", "EOEOE", "EOEOI", "EOEOO", "EOEOU", 
    "EOEUA", "EOEUE", "EOEUI", "EOEUO", "EOEUU",
    "EOIAA", "EOIAE", "EOIAI", "EOIAO", "EOIAU", 
    "EOIEA", "EOIEE", "EOIEI", "EOIEO", "EOIEU",
    "EOIIA", "EOIIE", "EOIII", "EOIIO", "EOIIU",
    "EOIOA", "EOIOE", "EOIOI", "EOIOO", "EOIOU", 
    "EOIUA", "EOIUE", "EOIUI", "EOIUO", "EOIUU",
    "EOOAA", "EOOAE", "EOOAI", "EOOAO", "EOOAU", 
    "EOOEA", "EOOEE", "EOOEI", "EOOEO", "EOOEU",
    "EOOIA", "EOOIE", "EOOII", "EOOIO", "EOOIU",
    "EOOOA", "EOOOE", "EOOOI", "EOOOO", "EOOOU", 
    "EOOUA", "EOOUE", "EOOUI", "EOOUO", "EOOUU",
    "EOUAA", "EOUAE", "EOUAI", "EOUAO", "EOUAU", 
    "EOUEA", "EOUEE", "EOUEI", "EOUEO", "EOUEU",
    "EOUIA", "EOUIE", "EOUII", "EOUIO", "EOUIU",
    "EOUOA", "EOUOE", "EOUOI", "EOUOO", "EOUOU", 
    "EOUUA", "EOUUE", "EOUUI", "EOUUO", "EOUUU",
    "EUAAA", "EUAAE", "EUAAI", "EUAAO", "EUAAU",
    "EUAEA", "EUAEE", "EUAEI", "EUAEO", "EUAEU",
    "EUAIA", "EUAIE", "EUAII", "EUAIO", "EUAIU",
    "EUAOA", "EUAOE", "EUAOI", "EUAOO", "EUAOU", 
    "EUAUA", "EUAUE", "EUAUI", "EUAUO", "EUAUU",
    "EUEAA", "EUEAE", "EUEAI", "EUEAO", "EUEAU", 
    "EUEEA", "EUEEE", "EUEEI", "EUEEO", "EUEEU",
    "EUEIA", "EUEIE", "EUEII", "EUEIO", "EUEIU",
    "EUEOA", "EUEOE", "EUEOI", "EUEOO", "EUEOU", 
    "EUEUA", "EUEUE", "EUEUI", "EUEUO", "EUEUU",
    "EUIAA", "EUIAE", "EUIAI", "EUIAO", "EUIAU", 
    "EUIEA", "EUIEE", "EUIEI", "EUIEO", "EUIEU",
    "EUIIA", "EUIIE", "EUIII", "EUIIO", "EUIIU",
    "EUIOA", "EUIOE", "EUIOI", "EUIOO", "EUIOU", 
    "EUIUA", "EUIUE", "EUIUI", "EUIUO", "EUIUU",
    "EUOAA", "EUOAE", "EUOAI", "EUOAO", "EUOAU", 
    "EUOEA", "EUOEE", "EUOEI", "EUOEO", "EUOEU",
    "EUOIA", "EUOIE", "EUOII", "EUOIO", "EUOIU",
    "EUOOA", "EUOOE", "EUOOI", "EUOOO", "EUOOU", 
    "EUOUA", "EUOUE", "EUOUI", "EUOUO", "EUOUU",
    "EUUAA", "EUUAE", "EUUAI", "EUUAO", "EUUAU", 
    "EUUEA", "EUUEE", "EUUEI", "EUUEO", "EUUEU",
    "EUUIA", "EUUIE", "EUUII", "EUUIO", "EUUIU",
    "EUUOA", "EUUOE", "EUUOI", "EUUOO", "EUUOU", 
    "EUUUA", "EUUUE", "EUUUI", "EUUUO", "EUUUU",
    "I", "IA", "IE", "II", "IO", "IU",
    "IAA", "IAE", "IAI", "IAO", "IAU", 
    "IEA", "IEE", "IEI", "IEO", "IEU",
    "IIA", "IIE", "III", "IIO", "IIU",
    "IOA", "IOE", "IOI", "IOO", "IOU", 
    "IUA", "IUE", "IUI", "IUO", "IUU",
    "IAAA", "IAAE", "IAAI", "IAAO", "IAAU",
    "IAEA", "IAEE", "IAEI", "IAEO", "IAEU",
    "IAIA", "IAIE", "IAII", "IAIO", "IAIU",
    "IAOA", "IAOE", "IAOI", "IAOO", "IAOU", 
    "IAUA", "IAUE", "IAUI", "IAUO", "IAUU",
    "IEAA", "IEAE", "IEAI", "IEAO", "IEAU", 
    "IEEA", "IEEE", "IEEI", "IEEO", "IEEU",
    "IEIA", "IEIE", "IEII", "IEIO", "IEIU",
    "IEOA", "IEOE", "IEOI", "IEOO", "IEOU", 
    "IEUA", "IEUE", "IEUI", "IEUO", "IEUU",
    "IIAA", "IIAE", "IIAI", "IIAO", "IIAU", 
    "IIEA", "IIEE", "IIEI", "IIEO", "IIEU",
    "IIIA", "IIIE", "IIII", "IIIO", "IIIU",
    "IIOA", "IIOE", "IIOI", "IIOO", "IIOU", 
    "IIUA", "IIUE", "IIUI", "IIUO", "IIUU",
    "IOAA", "IOAE", "IOAI", "IOAO", "IOAU", 
    "IOEA", "IOEE", "IOEI", "IOEO", "IOEU",
    "IOIA", "IOIE", "IOII", "IOIO", "IOIU",
    "IOOA", "IOOE", "IOOI", "IOOO", "IOOU", 
    "IOUA", "IOUE", "IOUI", "IOUO", "IOUU",
    "IUAA", "IUAE", "IUAI", "IUAO", "IUAU", 
    "IUEA", "IUEE", "IUEI", "IUEO", "IUEU",
    "IUIA", "IUIE", "IUII", "IUIO", "IUIU",
    "IUOA", "IUOE", "IUOI", "IUOO", "IUOU", 
    "IUUA", "IUUE", "IUUI", "IUUO", "IUUU",
    "IAAAA", "IAAAE", "IAAAI", "IAAAO", "IAAAU",
    "IAAEA", "IAAEE", "IAAEI", "IAAEO", "IAAEU",
    "IAAIA", "IAAIE", "IAAII", "IAAIO", "IAAIU",
    "IAAOA", "IAAOE", "IAAOI", "IAAOO", "IAAOU", 
    "IAAUA", "IAAUE", "IAAUI", "IAAUO", "IAAUU",
    "IAEAA", "IAEAE", "IAEAI", "IAEAO", "IAEAU", 
    "IAEEA", "IAEEE", "IAEEI", "IAEEO", "IAEEU",
    "IAEIA", "IAEIE", "IAEII", "IAEIO", "IAEIU",
    "IAEOA", "IAEOE", "IAEOI", "IAEOO", "IAEOU", 
    "IAEUA", "IAEUE", "IAEUI", "IAEUO", "IAEUU",
    "IAIAA", "IAIAE", "IAIAI", "IAIAO", "IAIAU", 
    "IAIEA", "IAIEE", "IAIEI", "IAIEO", "IAIEU",
    "IAIIA", "IAIIE", "IAIII", "IAIIO", "IAIIU",
    "IAIOA", "IAIOE", "IAIOI", "IAIOO", "IAIOU", 
    "IAIUA", "IAIUE", "IAIUI", "IAIUO", "IAIUU",
    "IAOAA", "IAOAE", "IAOAI", "IAOAO", "IAOAU", 
    "IAOEA", "IAOEE", "IAOEI", "IAOEO", "IAOEU",
    "IAOIA", "IAOIE", "IAOII", "IAOIO", "IAOIU",
    "IAOOA", "IAOOE", "IAOOI", "IAOOO", "IAOOU", 
    "IAOUA", "IAOUE", "IAOUI", "IAOUO", "IAOUU",
    "IAUAA", "IAUAE", "IAUAI", "IAUAO", "IAUAU", 
    "IAUEA", "IAUEE", "IAUEI", "IAUEO", "IAUEU",
    "IAUIA", "IAUIE", "IAUII", "IAUIO", "IAUIU",
    "IAUOA", "IAUOE", "IAUOI", "IAUOO", "IAUOU", 
    "IAUUA", "IAUUE", "IAUUI", "IAUUO", "IAUUU",
    "IEAAA", "IEAAE", "IEAAI", "IEAAO", "IEAAU",
    "IEAEA", "IEAEE", "IEAEI", "IEAEO", "IEAEU",
    "IEAIA", "IEAIE", "IEAII", "IEAIO", "IEAIU",
    "IEAOA", "IEAOE", "IEAOI", "IEAOO", "IEAOU", 
    "IEAUA", "IEAUE", "IEAUI", "IEAUO", "IEAUU",
    "IEEAA", "IEEAE", "IEEAI", "IEEAO", "IEEAU", 
    "IEEEA", "IEEEE", "IEEEI", "IEEEO", "IEEEU",
    "IEEIA", "IEEIE", "IEEII", "IEEIO", "IEEIU",
    "IEEOA", "IEEOE", "IEEOI", "IEEOO", "IEEOU", 
    "IEEUA", "IEEUE", "IEEUI", "IEEUO", "IEEUU",
    "IEIAA", "IEIAE", "IEIAI", "IEIAO", "IEIAU", 
    "IEIEA", "IEIEE", "IEIEI", "IEIEO", "IEIEU",
    "IEIIA", "IEIIE", "IEIII", "IEIIO", "IEIIU",
    "IEIOA", "IEIOE", "IEIOI", "IEIOO", "IEIOU", 
    "IEIUA", "IEIUE", "IEIUI", "IEIUO", "IEIUU",
    "IEOAA", "IEOAE", "IEOAI", "IEOAO", "IEOAU", 
    "IEOEA", "IEOEE", "IEOEI", "IEOEO", "IEOEU",
    "IEOIA", "IEOIE", "IEOII", "IEOIO", "IEOIU",
    "IEOOA", "IEOOE", "IEOOI", "IEOOO", "IEOOU", 
    "IEOUA", "IEOUE", "IEOUI", "IEOUO", "IEOUU",
    "IEUAA", "IEUAE", "IEUAI", "IEUAO", "IEUAU", 
    "IEUEA", "IEUEE", "IEUEI", "IEUEO", "IEUEU",
    "IEUIA", "IEUIE", "IEUII", "IEUIO", "IEUIU",
    "IEUOA", "IEUOE", "IEUOI", "IEUOO", "IEUOU", 
    "IEUUA", "IEUUE", "IEUUI", "IEUUO", "IEUUU",
    "IIAAA", "IIAAE", "IIAAI", "IIAAO", "IIAAU",
    "IIAEA", "IIAEE", "IIAEI", "IIAEO", "IIAEU",
    "IIAIA", "IIAIE", "IIAII", "IIAIO", "IIAIU",
    "IIAOA", "IIAOE", "IIAOI", "IIAOO", "IIAOU", 
    "IIAUA", "IIAUE", "IIAUI", "IIAUO", "IIAUU",
    "IIEAA", "IIEAE", "IIEAI", "IIEAO", "IIEAU", 
    "IIEEA", "IIEEE", "IIEEI", "IIEEO", "IIEEU",
    "IIEIA", "IIEIE", "IIEII", "IIEIO", "IIEIU",
    "IIEOA", "IIEOE", "IIEOI", "IIEOO", "IIEOU", 
    "IIEUA", "IIEUE", "IIEUI", "IIEUO", "IIEUU",
    "IIIAA", "IIIAE", "IIIAI", "IIIAO", "IIIAU", 
    "IIIEA", "IIIEE", "IIIEI", "IIIEO", "IIIEU",
    "IIIIA", "IIIIE", "IIIII", "IIIIO", "IIIIU",
    "IIIOA", "IIIOE", "IIIOI", "IIIOO", "IIIOU", 
    "IIIUA", "IIIUE", "IIIUI", "IIIUO", "IIIUU",
    "IIOAA", "IIOAE", "IIOAI", "IIOAO", "IIOAU", 
    "IIOEA", "IIOEE", "IIOEI", "IIOEO", "IIOEU",
    "IIOIA", "IIOIE", "IIOII", "IIOIO", "IIOIU",
    "IIOOA", "IIOOE", "IIOOI", "IIOOO", "IIOOU", 
    "IIOUA", "IIOUE", "IIOUI", "IIOUO", "IIOUU",
    "IIUAA", "IIUAE", "IIUAI", "IIUAO", "IIUAU", 
    "IIUEA", "IIUEE", "IIUEI", "IIUEO", "IIUEU",
    "IIUIA", "IIUIE", "IIUII", "IIUIO", "IIUIU",
    "IIUOA", "IIUOE", "IIUOI", "IIUOO", "IIUOU", 
    "IIUUA", "IIUUE", "IIUUI", "IIUUO", "IIUUU",
    "IOAAA", "IOAAE", "IOAAI", "IOAAO", "IOAAU",
    "IOAEA", "IOAEE", "IOAEI", "IOAEO", "IOAEU",
    "IOAIA", "IOAIE", "IOAII", "IOAIO", "IOAIU",
    "IOAOA", "IOAOE", "IOAOI", "IOAOO", "IOAOU", 
    "IOAUA", "IOAUE", "IOAUI", "IOAUO", "IOAUU",
    "IOEAA", "IOEAE", "IOEAI", "IOEAO", "IOEAU", 
    "IOEEA", "IOEEE", "IOEEI", "IOEEO", "IOEEU",
    "IOEIA", "IOEIE", "IOEII", "IOEIO", "IOEIU",
    "IOEOA", "IOEOE", "IOEOI", "IOEOO", "IOEOU", 
    "IOEUA", "IOEUE", "IOEUI", "IOEUO", "IOEUU",
    "IOIAA", "IOIAE", "IOIAI", "IOIAO", "IOIAU", 
    "IOIEA", "IOIEE", "IOIEI", "IOIEO", "IOIEU",
    "IOIIA", "IOIIE", "IOIII", "IOIIO", "IOIIU",
    "IOIOA", "IOIOE", "IOIOI", "IOIOO", "IOIOU", 
    "IOIUA", "IOIUE", "IOIUI", "IOIUO", "IOIUU",
    "IOOAA", "IOOAE", "IOOAI", "IOOAO", "IOOAU", 
    "IOOEA", "IOOEE", "IOOEI", "IOOEO", "IOOEU",
    "IOOIA", "IOOIE", "IOOII", "IOOIO", "IOOIU",
    "IOOOA", "IOOOE", "IOOOI", "IOOOO", "IOOOU", 
    "IOOUA", "IOOUE", "IOOUI", "IOOUO", "IOOUU",
    "IOUAA", "IOUAE", "IOUAI", "IOUAO", "IOUAU", 
    "IOUEA", "IOUEE", "IOUEI", "IOUEO", "IOUEU",
    "IOUIA", "IOUIE", "IOUII", "IOUIO", "IOUIU",
    "IOUOA", "IOUOE", "IOUOI", "IOUOO", "IOUOU", 
    "IOUUA", "IOUUE", "IOUUI", "IOUUO", "IOUUU",
    "IUAAA", "IUAAE", "IUAAI", "IUAAO", "IUAAU",
    "IUAEA", "IUAEE", "IUAEI", "IUAEO", "IUAEU",
    "IUAIA", "IUAIE", "IUAII", "IUAIO", "IUAIU",
    "IUAOA", "IUAOE", "IUAOI", "IUAOO", "IUAOU", 
    "IUAUA", "IUAUE", "IUAUI", "IUAUO", "IUAUU",
    "IUEAA", "IUEAE", "IUEAI", "IUEAO", "IUEAU", 
    "IUEEA", "IUEEE", "IUEEI", "IUEEO", "IUEEU",
    "IUEIA", "IUEIE", "IUEII", "IUEIO", "IUEIU",
    "IUEOA", "IUEOE", "IUEOI", "IUEOO", "IUEOU", 
    "IUEUA", "IUEUE", "IUEUI", "IUEUO", "IUEUU",
    "IUIAA", "IUIAE", "IUIAI", "IUIAO", "IUIAU", 
    "IUIEA", "IUIEE", "IUIEI", "IUIEO", "IUIEU",
    "IUIIA", "IUIIE", "IUIII", "IUIIO", "IUIIU",
    "IUIOA", "IUIOE", "IUIOI", "IUIOO", "IUIOU", 
    "IUIUA", "IUIUE", "IUIUI", "IUIUO", "IUIUU",
    "IUOAA", "IUOAE", "IUOAI", "IUOAO", "IUOAU", 
    "IUOEA", "IUOEE", "IUOEI", "IUOEO", "IUOEU",
    "IUOIA", "IUOIE", "IUOII", "IUOIO", "IUOIU",
    "IUOOA", "IUOOE", "IUOOI", "IUOOO", "IUOOU", 
    "IUOUA", "IUOUE", "IUOUI", "IUOUO", "IUOUU",
    "IUUAA", "IUUAE", "IUUAI", "IUUAO", "IUUAU", 
    "IUUEA", "IUUEE", "IUUEI", "IUUEO", "IUUEU",
    "IUUIA", "IUUIE", "IUUII", "IUUIO", "IUUIU",
    "IUUOA", "IUUOE", "IUUOI", "IUUOO", "IUUOU", 
    "IUUUA", "IUUUE", "IUUUI", "IUUUO", "IUUUU",
    "O", "OA", "OE", "OI", "OO", "OU", 
    "OAA", "OAE", "OAI", "OAO", "OAU", 
    "OEA", "OEE", "OEI", "OEO", "OEU",
    "OIA", "OIE", "OII", "OIO", "OIU",
    "OOA", "OOE", "OOI", "OOO", "OOU", 
    "OUA", "OUE", "OUI", "OUO", "OUU",
    "OAAA", "OAAE", "OAAI", "OAAO", "OAAU",
    "OAEA", "OAEE", "OAEI", "OAEO", "OAEU",
    "OAIA", "OAIE", "OAII", "OAIO", "OAIU",
    "OAOA", "OAOE", "OAOI", "OAOO", "OAOU", 
    "OAUA", "OAUE", "OAUI", "OAUO", "OAUU",
    "OEAA", "OEAE", "OEAI", "OEAO", "OEAU", 
    "OEEA", "OEEE", "OEEI", "OEEO", "OEEU",
    "OEIA", "OEIE", "OEII", "OEIO", "OEIU",
    "OEOA", "OEOE", "OEOI", "OEOO", "OEOU", 
    "OEUA", "OEUE", "OEUI", "OEUO", "OEUU",
    "OIAA", "OIAE", "OIAI", "OIAO", "OIAU", 
    "OIEA", "OIEE", "OIEI", "OIEO", "OIEU",
    "OIIA", "OIIE", "OIII", "OIIO", "OIIU",
    "OIOA", "OIOE", "OIOI", "OIOO", "OIOU", 
    "OIUA", "OIUE", "OIUI", "OIUO", "OIUU",
    "OOAA", "OOAE", "OOAI", "OOAO", "OOAU", 
    "OOEA", "OOEE", "OOEI", "OOEO", "OOEU",
    "OOIA", "OOIE", "OOII", "OOIO", "OOIU",
    "OOOA", "OOOE", "OOOI", "OOOO", "OOOU", 
    "OOUA", "OOUE", "OOUI", "OOUO", "OOUU",
    "OUAA", "OUAE", "OUAI", "OUAO", "OUAU", 
    "OUEA", "OUEE", "OUEI", "OUEO", "OUEU",
    "OUIA", "OUIE", "OUII", "OUIO", "OUIU",
    "OUOA", "OUOE", "OUOI", "OUOO", "OUOU", 
    "OUUA", "OUUE", "OUUI", "OUUO", "OUUU",
    "OAAAA", "OAAAE", "OAAAI", "OAAAO", "OAAAU",
    "OAAEA", "OAAEE", "OAAEI", "OAAEO", "OAAEU",
    "OAAIA", "OAAIE", "OAAII", "OAAIO", "OAAIU",
    "OAAOA", "OAAOE", "OAAOI", "OAAOO", "OAAOU", 
    "OAAUA", "OAAUE", "OAAUI", "OAAUO", "OAAUU",
    "OAEAA", "OAEAE", "OAEAI", "OAEAO", "OAEAU", 
    "OAEEA", "OAEEE", "OAEEI", "OAEEO", "OAEEU",
    "OAEIA", "OAEIE", "OAEII", "OAEIO", "OAEIU",
    "OAEOA", "OAEOE", "OAEOI", "OAEOO", "OAEOU", 
    "OAEUA", "OAEUE", "OAEUI", "OAEUO", "OAEUU",
    "OAIAA", "OAIAE", "OAIAI", "OAIAO", "OAIAU", 
    "OAIEA", "OAIEE", "OAIEI", "OAIEO", "OAIEU",
    "OAIIA", "OAIIE", "OAIII", "OAIIO", "OAIIU",
    "OAIOA", "OAIOE", "OAIOI", "OAIOO", "OAIOU", 
    "OAIUA", "OAIUE", "OAIUI", "OAIUO", "OAIUU",
    "OAOAA", "OAOAE", "OAOAI", "OAOAO", "OAOAU", 
    "OAOEA", "OAOEE", "OAOEI", "OAOEO", "OAOEU",
    "OAOIA", "OAOIE", "OAOII", "OAOIO", "OAOIU",
    "OAOOA", "OAOOE", "OAOOI", "OAOOO", "OAOOU", 
    "OAOUA", "OAOUE", "OAOUI", "OAOUO", "OAOUU",
    "OAUAA", "OAUAE", "OAUAI", "OAUAO", "OAUAU", 
    "OAUEA", "OAUEE", "OAUEI", "OAUEO", "OAUEU",
    "OAUIA", "OAUIE", "OAUII", "OAUIO", "OAUIU",
    "OAUOA", "OAUOE", "OAUOI", "OAUOO", "OAUOU", 
    "OAUUA", "OAUUE", "OAUUI", "OAUUO", "OAUUU",
    "OEAAA", "OEAAE", "OEAAI", "OEAAO", "OEAAU",
    "OEAEA", "OEAEE", "OEAEI", "OEAEO", "OEAEU",
    "OEAIA", "OEAIE", "OEAII", "OEAIO", "OEAIU",
    "OEAOA", "OEAOE", "OEAOI", "OEAOO", "OEAOU", 
    "OEAUA", "OEAUE", "OEAUI", "OEAUO", "OEAUU",
    "OEEAA", "OEEAE", "OEEAI", "OEEAO", "OEEAU", 
    "OEEEA", "OEEEE", "OEEEI", "OEEEO", "OEEEU",
    "OEEIA", "OEEIE", "OEEII", "OEEIO", "OEEIU",
    "OEEOA", "OEEOE", "OEEOI", "OEEOO", "OEEOU", 
    "OEEUA", "OEEUE", "OEEUI", "OEEUO", "OEEUU",
    "OEIAA", "OEIAE", "OEIAI", "OEIAO", "OEIAU", 
    "OEIEA", "OEIEE", "OEIEI", "OEIEO", "OEIEU",
    "OEIIA", "OEIIE", "OEIII", "OEIIO", "OEIIU",
    "OEIOA", "OEIOE", "OEIOI", "OEIOO", "OEIOU", 
    "OEIUA", "OEIUE", "OEIUI", "OEIUO", "OEIUU",
    "OEOAA", "OEOAE", "OEOAI", "OEOAO", "OEOAU", 
    "OEOEA", "OEOEE", "OEOEI", "OEOEO", "OEOEU",
    "OEOIA", "OEOIE", "OEOII", "OEOIO", "OEOIU",
    "OEOOA", "OEOOE", "OEOOI", "OEOOO", "OEOOU", 
    "OEOUA", "OEOUE", "OEOUI", "OEOUO", "OEOUU",
    "OEUAA", "OEUAE", "OEUAI", "OEUAO", "OEUAU", 
    "OEUEA", "OEUEE", "OEUEI", "OEUEO", "OEUEU",
    "OEUIA", "OEUIE", "OEUII", "OEUIO", "OEUIU",
    "OEUOA", "OEUOE", "OEUOI", "OEUOO", "OEUOU", 
    "OEUUA", "OEUUE", "OEUUI", "OEUUO", "OEUUU",
    "OIAAA", "OIAAE", "OIAAI", "OIAAO", "OIAAU",
    "OIAEA", "OIAEE", "OIAEI", "OIAEO", "OIAEU",
    "OIAIA", "OIAIE", "OIAII", "OIAIO", "OIAIU",
    "OIAOA", "OIAOE", "OIAOI", "OIAOO", "OIAOU", 
    "OIAUA", "OIAUE", "OIAUI", "OIAUO", "OIAUU",
    "OIEAA", "OIEAE", "OIEAI", "OIEAO", "OIEAU", 
    "OIEEA", "OIEEE", "OIEEI", "OIEEO", "OIEEU",
    "OIEIA", "OIEIE", "OIEII", "OIEIO", "OIEIU",
    "OIEOA", "OIEOE", "OIEOI", "OIEOO", "OIEOU", 
    "OIEUA", "OIEUE", "OIEUI", "OIEUO", "OIEUU",
    "OIIAA", "OIIAE", "OIIAI", "OIIAO", "OIIAU", 
    "OIIEA", "OIIEE", "OIIEI", "OIIEO", "OIIEU",
    "OIIIA", "OIIIE", "OIIII", "OIIIO", "OIIIU",
    "OIIOA", "OIIOE", "OIIOI", "OIIOO", "OIIOU", 
    "OIIUA", "OIIUE", "OIIUI", "OIIUO", "OIIUU",
    "OIOAA", "OIOAE", "OIOAI", "OIOAO", "OIOAU", 
    "OIOEA", "OIOEE", "OIOEI", "OIOEO", "OIOEU",
    "OIOIA", "OIOIE", "OIOII", "OIOIO", "OIOIU",
    "OIOOA", "OIOOE", "OIOOI", "OIOOO", "OIOOU", 
    "OIOUA", "OIOUE", "OIOUI", "OIOUO", "OIOUU",
    "OIUAA", "OIUAE", "OIUAI", "OIUAO", "OIUAU", 
    "OIUEA", "OIUEE", "OIUEI", "OIUEO", "OIUEU",
    "OIUIA", "OIUIE", "OIUII", "OIUIO", "OIUIU",
    "OIUOA", "OIUOE", "OIUOI", "OIUOO", "OIUOU", 
    "OIUUA", "OIUUE", "OIUUI", "OIUUO", "OIUUU",
    "OOAAA", "OOAAE", "OOAAI", "OOAAO", "OOAAU",
    "OOAEA", "OOAEE", "OOAEI", "OOAEO", "OOAEU",
    "OOAIA", "OOAIE", "OOAII", "OOAIO", "OOAIU",
    "OOAOA", "OOAOE", "OOAOI", "OOAOO", "OOAOU", 
    "OOAUA", "OOAUE", "OOAUI", "OOAUO", "OOAUU",
    "OOEAA", "OOEAE", "OOEAI", "OOEAO", "OOEAU", 
    "OOEEA", "OOEEE", "OOEEI", "OOEEO", "OOEEU",
    "OOEIA", "OOEIE", "OOEII", "OOEIO", "OOEIU",
    "OOEOA", "OOEOE", "OOEOI", "OOEOO", "OOEOU", 
    "OOEUA", "OOEUE", "OOEUI", "OOEUO", "OOEUU",
    "OOIAA", "OOIAE", "OOIAI", "OOIAO", "OOIAU", 
    "OOIEA", "OOIEE", "OOIEI", "OOIEO", "OOIEU",
    "OOIIA", "OOIIE", "OOIII", "OOIIO", "OOIIU",
    "OOIOA", "OOIOE", "OOIOI", "OOIOO", "OOIOU", 
    "OOIUA", "OOIUE", "OOIUI", "OOIUO", "OOIUU",
    "OOOAA", "OOOAE", "OOOAI", "OOOAO", "OOOAU", 
    "OOOEA", "OOOEE", "OOOEI", "OOOEO", "OOOEU",
    "OOOIA", "OOOIE", "OOOII", "OOOIO", "OOOIU",
    "OOOOA", "OOOOE", "OOOOI", "OOOOO", "OOOOU", 
    "OOOUA", "OOOUE", "OOOUI", "OOOUO", "OOOUU",
    "OOUAA", "OOUAE", "OOUAI", "OOUAO", "OOUAU", 
    "OOUEA", "OOUEE", "OOUEI", "OOUEO", "OOUEU",
    "OOUIA", "OOUIE", "OOUII", "OOUIO", "OOUIU",
    "OOUOA", "OOUOE", "OOUOI", "OOUOO", "OOUOU", 
    "OOUUA", "OOUUE", "OOUUI", "OOUUO", "OOUUU",
    "OUAAA", "OUAAE", "OUAAI", "OUAAO", "OUAAU",
    "OUAEA", "OUAEE", "OUAEI", "OUAEO", "OUAEU",
    "OUAIA", "OUAIE", "OUAII", "OUAIO", "OUAIU",
    "OUAOA", "OUAOE", "OUAOI", "OUAOO", "OUAOU", 
    "OUAUA", "OUAUE", "OUAUI", "OUAUO", "OUAUU",
    "OUEAA", "OUEAE", "OUEAI", "OUEAO", "OUEAU", 
    "OUEEA", "OUEEE", "OUEEI", "OUEEO", "OUEEU",
    "OUEIA", "OUEIE", "OUEII", "OUEIO", "OUEIU",
    "OUEOA", "OUEOE", "OUEOI", "OUEOO", "OUEOU", 
    "OUEUA", "OUEUE", "OUEUI", "OUEUO", "OUEUU",
    "OUIAA", "OUIAE", "OUIAI", "OUIAO", "OUIAU", 
    "OUIEA", "OUIEE", "OUIEI", "OUIEO", "OUIEU",
    "OUIIA", "OUIIE", "OUIII", "OUIIO", "OUIIU",
    "OUIOA", "OUIOE", "OUIOI", "OUIOO", "OUIOU", 
    "OUIUA", "OUIUE", "OUIUI", "OUIUO", "OUIUU",
    "OUOAA", "OUOAE", "OUOAI", "OUOAO", "OUOAU", 
    "OUOEA", "OUOEE", "OUOEI", "OUOEO", "OUOEU",
    "OUOIA", "OUOIE", "OUOII", "OUOIO", "OUOIU",
    "OUOOA", "OUOOE", "OUOOI", "OUOOO", "OUOOU", 
    "OUOUA", "OUOUE", "OUOUI", "OUOUO", "OUOUU",
    "OUUAA", "OUUAE", "OUUAI", "OUUAO", "OUUAU", 
    "OUUEA", "OUUEE", "OUUEI", "OUUEO", "OUUEU",
    "OUUIA", "OUUIE", "OUUII", "OUUIO", "OUUIU",
    "OUUOA", "OUUOE", "OUUOI", "OUUOO", "OUUOU", 
    "OUUUA", "OUUUE", "OUUUI", "OUUUO", "OUUUU",
    "U", "UA", "UE", "UI", "UO", "UU",
    "UAA", "UAE", "UAI", "UAO", "UAU", 
    "UEA", "UEE", "UEI", "UEO", "UEU",
    "UIA", "UIE", "UII", "UIO", "UIU",
    "UOA", "UOE", "UOI", "UOO", "UOU", 
    "UUA", "UUE", "UUI", "UUO", "UUU",
    "UAAA", "UAAE", "UAAI", "UAAO", "UAAU",
    "UAEA", "UAEE", "UAEI", "UAEO", "UAEU",
    "UAIA", "UAIE", "UAII", "UAIO", "UAIU",
    "UAOA", "UAOE", "UAOI", "UAOO", "UAOU", 
    "UAUA", "UAUE", "UAUI", "UAUO", "UAUU",
    "UEAA", "UEAE", "UEAI", "UEAO", "UEAU", 
    "UEEA", "UEEE", "UEEI", "UEEO", "UEEU",
    "UEIA", "UEIE", "UEII", "UEIO", "UEIU",
    "UEOA", "UEOE", "UEOI", "UEOO", "UEOU", 
    "UEUA", "UEUE", "UEUI", "UEUO", "UEUU",
    "UIAA", "UIAE", "UIAI", "UIAO", "UIAU", 
    "UIEA", "UIEE", "UIEI", "UIEO", "UIEU",
    "UIIA", "UIIE", "UIII", "UIIO", "UIIU",
    "UIOA", "UIOE", "UIOI", "UIOO", "UIOU", 
    "UIUA", "UIUE", "UIUI", "UIUO", "UIUU",
    "UOAA", "UOAE", "UOAI", "UOAO", "UOAU", 
    "UOEA", "UOEE", "UOEI", "UOEO", "UOEU",
    "UOIA", "UOIE", "UOII", "UOIO", "UOIU",
    "UOOA", "UOOE", "UOOI", "UOOO", "UOOU", 
    "UOUA", "UOUE", "UOUI", "UOUO", "UOUU",
    "UUAA", "UUAE", "UUAI", "UUAO", "UUAU", 
    "UUEA", "UUEE", "UUEI", "UUEO", "UUEU",
    "UUIA", "UUIE", "UUII", "UUIO", "UUIU",
    "UUOA", "UUOE", "UUOI", "UUOO", "UUOU", 
    "UUUA", "UUUE", "UUUI", "UUUO", "UUUU",
    "UAAAA", "UAAAE", "UAAAI", "UAAAO", "UAAAU",
    "UAAEA", "UAAEE", "UAAEI", "UAAEO", "UAAEU",
    "UAAIA", "UAAIE", "UAAII", "UAAIO", "UAAIU",
    "UAAOA", "UAAOE", "UAAOI", "UAAOO", "UAAOU", 
    "UAAUA", "UAAUE", "UAAUI", "UAAUO", "UAAUU",
    "UAEAA", "UAEAE", "UAEAI", "UAEAO", "UAEAU", 
    "UAEEA", "UAEEE", "UAEEI", "UAEEO", "UAEEU",
    "UAEIA", "UAEIE", "UAEII", "UAEIO", "UAEIU",
    "UAEOA", "UAEOE", "UAEOI", "UAEOO", "UAEOU", 
    "UAEUA", "UAEUE", "UAEUI", "UAEUO", "UAEUU",
    "UAIAA", "UAIAE", "UAIAI", "UAIAO", "UAIAU", 
    "UAIEA", "UAIEE", "UAIEI", "UAIEO", "UAIEU",
    "UAIIA", "UAIIE", "UAIII", "UAIIO", "UAIIU",
    "UAIOA", "UAIOE", "UAIOI", "UAIOO", "UAIOU", 
    "UAIUA", "UAIUE", "UAIUI", "UAIUO", "UAIUU",
    "UAOAA", "UAOAE", "UAOAI", "UAOAO", "UAOAU", 
    "UAOEA", "UAOEE", "UAOEI", "UAOEO", "UAOEU",
    "UAOIA", "UAOIE", "UAOII", "UAOIO", "UAOIU",
    "UAOOA", "UAOOE", "UAOOI", "UAOOO", "UAOOU", 
    "UAOUA", "UAOUE", "UAOUI", "UAOUO", "UAOUU",
    "UAUAA", "UAUAE", "UAUAI", "UAUAO", "UAUAU", 
    "UAUEA", "UAUEE", "UAUEI", "UAUEO", "UAUEU",
    "UAUIA", "UAUIE", "UAUII", "UAUIO", "UAUIU",
    "UAUOA", "UAUOE", "UAUOI", "UAUOO", "UAUOU", 
    "UAUUA", "UAUUE", "UAUUI", "UAUUO", "UAUUU",
    "UEAAA", "UEAAE", "UEAAI", "UEAAO", "UEAAU",
    "UEAEA", "UEAEE", "UEAEI", "UEAEO", "UEAEU",
    "UEAIA", "UEAIE", "UEAII", "UEAIO", "UEAIU",
    "UEAOA", "UEAOE", "UEAOI", "UEAOO", "UEAOU", 
    "UEAUA", "UEAUE", "UEAUI", "UEAUO", "UEAUU",
    "UEEAA", "UEEAE", "UEEAI", "UEEAO", "UEEAU", 
    "UEEEA", "UEEEE", "UEEEI", "UEEEO", "UEEEU",
    "UEEIA", "UEEIE", "UEEII", "UEEIO", "UEEIU",
    "UEEOA", "UEEOE", "UEEOI", "UEEOO", "UEEOU", 
    "UEEUA", "UEEUE", "UEEUI", "UEEUO", "UEEUU",
    "UEIAA", "UEIAE", "UEIAI", "UEIAO", "UEIAU", 
    "UEIEA", "UEIEE", "UEIEI", "UEIEO", "UEIEU",
    "UEIIA", "UEIIE", "UEIII", "UEIIO", "UEIIU",
    "UEIOA", "UEIOE", "UEIOI", "UEIOO", "UEIOU", 
    "UEIUA", "UEIUE", "UEIUI", "UEIUO", "UEIUU",
    "UEOAA", "UEOAE", "UEOAI", "UEOAO", "UEOAU", 
    "UEOEA", "UEOEE", "UEOEI", "UEOEO", "UEOEU",
    "UEOIA", "UEOIE", "UEOII", "UEOIO", "UEOIU",
    "UEOOA", "UEOOE", "UEOOI", "UEOOO", "UEOOU", 
    "UEOUA", "UEOUE", "UEOUI", "UEOUO", "UEOUU",
    "UEUAA", "UEUAE", "UEUAI", "UEUAO", "UEUAU", 
    "UEUEA", "UEUEE", "UEUEI", "UEUEO", "UEUEU",
    "UEUIA", "UEUIE", "UEUII", "UEUIO", "UEUIU",
    "UEUOA", "UEUOE", "UEUOI", "UEUOO", "UEUOU", 
    "UEUUA", "UEUUE", "UEUUI", "UEUUO", "UEUUU",
    "UIAAA", "UIAAE", "UIAAI", "UIAAO", "UIAAU",
    "UIAEA", "UIAEE", "UIAEI", "UIAEO", "UIAEU",
    "UIAIA", "UIAIE", "UIAII", "UIAIO", "UIAIU",
    "UIAOA", "UIAOE", "UIAOI", "UIAOO", "UIAOU", 
    "UIAUA", "UIAUE", "UIAUI", "UIAUO", "UIAUU",
    "UIEAA", "UIEAE", "UIEAI", "UIEAO", "UIEAU", 
    "UIEEA", "UIEEE", "UIEEI", "UIEEO", "UIEEU",
    "UIEIA", "UIEIE", "UIEII", "UIEIO", "UIEIU",
    "UIEOA", "UIEOE", "UIEOI", "UIEOO", "UIEOU", 
    "UIEUA", "UIEUE", "UIEUI", "UIEUO", "UIEUU",
    "UIIAA", "UIIAE", "UIIAI", "UIIAO", "UIIAU", 
    "UIIEA", "UIIEE", "UIIEI", "UIIEO", "UIIEU",
    "UIIIA", "UIIIE", "UIIII", "UIIIO", "UIIIU",
    "UIIOA", "UIIOE", "UIIOI", "UIIOO", "UIIOU", 
    "UIIUA", "UIIUE", "UIIUI", "UIIUO", "UIIUU",
    "UIOAA", "UIOAE", "UIOAI", "UIOAO", "UIOAU", 
    "UIOEA", "UIOEE", "UIOEI", "UIOEO", "UIOEU",
    "UIOIA", "UIOIE", "UIOII", "UIOIO", "UIOIU",
    "UIOOA", "UIOOE", "UIOOI", "UIOOO", "UIOOU", 
    "UIOUA", "UIOUE", "UIOUI", "UIOUO", "UIOUU",
    "UIUAA", "UIUAE", "UIUAI", "UIUAO", "UIUAU", 
    "UIUEA", "UIUEE", "UIUEI", "UIUEO", "UIUEU",
    "UIUIA", "UIUIE", "UIUII", "UIUIO", "UIUIU",
    "UIUOA", "UIUOE", "UIUOI", "UIUOO", "UIUOU", 
    "UIUUA", "UIUUE", "UIUUI", "UIUUO", "UIUUU",
    "UOAAA", "UOAAE", "UOAAI", "UOAAO", "UOAAU",
    "UOAEA", "UOAEE", "UOAEI", "UOAEO", "UOAEU",
    "UOAIA", "UOAIE", "UOAII", "UOAIO", "UOAIU",
    "UOAOA", "UOAOE", "UOAOI", "UOAOO", "UOAOU", 
    "UOAUA", "UOAUE", "UOAUI", "UOAUO", "UOAUU",
    "UOEAA", "UOEAE", "UOEAI", "UOEAO", "UOEAU", 
    "UOEEA", "UOEEE", "UOEEI", "UOEEO", "UOEEU",
    "UOEIA", "UOEIE", "UOEII", "UOEIO", "UOEIU",
    "UOEOA", "UOEOE", "UOEOI", "UOEOO", "UOEOU", 
    "UOEUA", "UOEUE", "UOEUI", "UOEUO", "UOEUU",
    "UOIAA", "UOIAE", "UOIAI", "UOIAO", "UOIAU", 
    "UOIEA", "UOIEE", "UOIEI", "UOIEO", "UOIEU",
    "UOIIA", "UOIIE", "UOIII", "UOIIO", "UOIIU",
    "UOIOA", "UOIOE", "UOIOI", "UOIOO", "UOIOU", 
    "UOIUA", "UOIUE", "UOIUI", "UOIUO", "UOIUU",
    "UOOAA", "UOOAE", "UOOAI", "UOOAO", "UOOAU", 
    "UOOEA", "UOOEE", "UOOEI", "UOOEO", "UOOEU",
    "UOOIA", "UOOIE", "UOOII", "UOOIO", "UOOIU",
    "UOOOA", "UOOOE", "UOOOI", "UOOOO", "UOOOU", 
    "UOOUA", "UOOUE", "UOOUI", "UOOUO", "UOOUU",
    "UOUAA", "UOUAE", "UOUAI", "UOUAO", "UOUAU", 
    "UOUEA", "UOUEE", "UOUEI", "UOUEO", "UOUEU",
    "UOUIA", "UOUIE", "UOUII", "UOUIO", "UOUIU",
    "UOUOA", "UOUOE", "UOUOI", "UOUOO", "UOUOU", 
    "UOUUA", "UOUUE", "UOUUI", "UOUUO", "UOUUU",
    "UUAAA", "UUAAE", "UUAAI", "UUAAO", "UUAAU",
    "UUAEA", "UUAEE", "UUAEI", "UUAEO", "UUAEU",
    "UUAIA", "UUAIE", "UUAII", "UUAIO", "UUAIU",
    "UUAOA", "UUAOE", "UUAOI", "UUAOO", "UUAOU", 
    "UUAUA", "UUAUE", "UUAUI", "UUAUO", "UUAUU",
    "UUEAA", "UUEAE", "UUEAI", "UUEAO", "UUEAU", 
    "UUEEA", "UUEEE", "UUEEI", "UUEEO", "UUEEU",
    "UUEIA", "UUEIE", "UUEII", "UUEIO", "UUEIU",
    "UUEOA", "UUEOE", "UUEOI", "UUEOO", "UUEOU", 
    "UUEUA", "UUEUE", "UUEUI", "UUEUO", "UUEUU",
    "UUIAA", "UUIAE", "UUIAI", "UUIAO", "UUIAU", 
    "UUIEA", "UUIEE", "UUIEI", "UUIEO", "UUIEU",
    "UUIIA", "UUIIE", "UUIII", "UUIIO", "UUIIU",
    "UUIOA", "UUIOE", "UUIOI", "UUIOO", "UUIOU", 
    "UUIUA", "UUIUE", "UUIUI", "UUIUO", "UUIUU",
    "UUOAA", "UUOAE", "UUOAI", "UUOAO", "UUOAU", 
    "UUOEA", "UUOEE", "UUOEI", "UUOEO", "UUOEU",
    "UUOIA", "UUOIE", "UUOII", "UUOIO", "UUOIU",
    "UUOOA", "UUOOE", "UUOOI", "UUOOO", "UUOOU", 
    "UUOUA", "UUOUE", "UUOUI", "UUOUO", "UUOUU",
    "UUUAA", "UUUAE", "UUUAI", "UUUAO", "UUUAU", 
    "UUUEA", "UUUEE", "UUUEI", "UUUEO", "UUUEU",
    "UUUIA", "UUUIE", "UUUII", "UUUIO", "UUUIU",
    "UUUOA", "UUUOE", "UUUOI", "UUUOO", "UUUOU", 
    "UUUUA", "UUUUE", "UUUUI", "UUUUO", "UUUUU"
  };

    LinkedList<String> list = new LinkedList<>(Arrays.asList(words));
    Collections.sort(list);

    if(list.contains(word))
    {
      return list.indexOf(word)+1;
    }


    
    return -1;
  }

  public static void main(String[] args) 
  {
    Solution_Kit25 sol = new Solution_Kit25();
    System.out.println(sol.solution("EIO"));
  }
  
}
