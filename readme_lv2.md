---


---

<h1 id="lv2--domaća-zadaća">LV2- Domaća zadaća</h1>
<p>Zadatak ove domaće zadaće je bio realizirati jednostavni konverter jedinica. To je realizirano pomoću 6 activitija. Pri čemu je na prvom activitiju pomoću ImageButtona prikazano 4 ikone koje simboliziraju željenu pretvorbu. Klikom na jedan od ImageButtona otvara se activitiy namjijenjen za konverziju te veličine. Te klikom na Button “Convert” u novootvorenom activitiju otvara se sljedeći aktivity koji služi za prikaz rezultata.</p>
<h2 id="screenshoots">Screenshoots</h2>
<p>Prvi Activity<br>
<img src="https://scontent-vie1-1.xx.fbcdn.net/v/t34.0-12/30180181_1955657941145560_1022276850_n.jpg?_nc_cat=0&amp;oh=3169b6d6b7ff3a7b621184a8dcbe6d0f&amp;oe=5ACC2F36" alt="First Activity"><br>
Drugi activity<br>
<img src="https://scontent-vie1-1.xx.fbcdn.net/v/t34.0-12/30118878_1955662927811728_1555886270_n.jpg?_nc_cat=0&amp;oh=3d4c21362e96ec65b5c92e296b214082&amp;oe=5ACD4900" alt="enter image description here"><br>
Treći activity<br>
<img src="https://scontent-vie1-1.xx.fbcdn.net/v/t34.0-12/30120370_1955668594477828_1661469089_n.jpg?_nc_cat=0&amp;oh=939cee1629793e299204a7901bede397&amp;oe=5ACC6A45" alt="enter image description here"></p>
<h2 id="aktivitiji">Aktivitiji</h2>
<h3 id="buttonshowcaseactivity">ButtonShowcaseActivity</h3>
<p>u xml dokumentu je realiziran dizajn aktivitija; koji se sastoji od četiri ImageButtona smještenih unutar Linear layouta).</p>
<p>Unutar njega su realizurane četiri metode; za svaku pretvorbu po jedna koje se pozovu prilikom klika na određeni ImageButton. Unutar metode se pomoću novog kreiranog objekta klase <strong>intent</strong>  pokreće se drugi Activity (u ovisnosti unutar koje metode se nalazi ostvara se različit aktivity, npr unutar metode <em>onClickDistance</em> je kreiran intent za otvaranje DistanceConversion activitija).</p>
<h3 id="conversionactivity">ConversionActivity</h3>
<p>Ista je logika i kod <em>WeightConversion</em>, <em>DistanceConversion</em> i <em>VolumeConversion</em> aktivitija, te je isti i dizajn realiziran u xml dokumentu. Unutar Realtivnog layouta nalazi se TextView za prikaz naslova konverzije, dva Spinnera za odabir jedinica konverzije, EditText za korisnički unos vrijednosti i nevidljivi TextView ( nevidljiv je jer je iste boje kao i pozadina jer je cilj prikazati rezultat na sljedećem aktivitiju, a ne na trenutnom, pa se ovaj TextView koristi samo kao pomoći čija se vrijednost šalje na aktiviti za prikaz rezultata) za ispis rezultata konverzije, te na dnu layouta Button. Prilikom klika na button poziva se metoda za konverziju i rezultat se šalje na drugi activity.</p>
<p>Dakle, nema potrebe objašnjavati sva 4 activitija za konverziju, te će sve biti objašnjeno na ovom.</p>
<h4 id="riješeni-problemi">Riješeni problemi</h4>
<p>Prilikom realizacije aktivitija postojala su tri glavna problema koja su uspješno riješena:</p>
<p><em>Prvi problem</em> je bio rad sa spinnerima, te omogućiti kada korisnik izabere željenu jedinicu s dropdown liste da ta jedinica bude prikazana na spinneru. Prvenstveno su relizirana dva spinnera pomoću dva adaptera. Kreiran je ArrayAdapter pomoću string arraya (koji je prethodno definiran unutar string.xml) i defaultnog spinner layouta. Te je definiran izgled koji bi adapter trebao koristiti, te na kraju je <strong>adapter</strong> primijenjen na spinneru. Pomoću metode onItemSelected je omogućeno da se vrijednost sa izabrane pozicije u dropdown listi prikaze na  spinneru.</p>
<p><em>Drugi problem</em> je bila realizacija metode koja vrši konverziju prilikom klika na gumb. Vrijednost upisana u EditText polje se prebacuje u string i sprema  u pomoćnu varijablu “value”, te se također definira pomoćna varijabla “res” za spremanje rezultata. Izračun se vrši unutar if petlji, na način da se provjerava pozicija prvog spinera te pozicija drugog spinera i onda se vrši adekvatan proracun čiji se rezultat sprema u “res” te potom prebacuje u string i prikazuje u  “nevidljivom” TextViewu namijenjenom za čuvanje rezultata. Npr. ukoliko je pozicija prvog Spinnera = 0 (Celsius), a drugog =1 (Kelvin), rezultat se računa kao vrijednost “value” +273.15.</p>
<p><em>Treći problem</em> je bio proslijeđivanje podataka sa ConversionActivity-ja na <em>DisplayResultActivity</em>. Unutar objekta klase Intent smješteni su podatci koji su objekti tipa String i tim načinom su proslijeđeni na drugi activity . Korištena je metoda <strong>putExtra()</strong>. U DisplayResultActivity-ju se provjerava postoje li ti podatci u prvom activitiju, te ukoliko postoje  dohvaćaju se.</p>
<h2 id="helpful-links">Helpful links</h2>
<p><a href="https://stackoverflow.com/questions/41042681/length-converter-android-studio">Sackoverflow SOS</a><br>
<a href="https://www.youtube.com/watch?v=AAOUZIfktm0">Youtube tutorial lenght convert</a></p>

