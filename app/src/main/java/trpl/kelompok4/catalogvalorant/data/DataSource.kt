package trpl.kelompok4.catalogvalorant.data

import trpl.kelompok4.catalogvalorant.R
import trpl.kelompok4.catalogvalorant.model.Agent
import trpl.kelompok4.catalogvalorant.model.Weapon
import trpl.kelompok4.catalogvalorant.model.Map

object ValorantDataSource {

    fun getAgents(): List<Agent> {
        return listOf(
            Agent("Jett", "Duelist dari Korea Selatan yang lincah dan berbahaya dengan kemampuan angin untuk mengendalikan pergerakan dan menyerang musuh.", R.drawable.jett),
            Agent("Phoenix", "Duelist dari Inggris yang memanfaatkan api untuk menyerang musuh sekaligus menyembuhkan dirinya sendiri.", R.drawable.phoenix),
            Agent("Sage", "Sentinel dari Tiongkok yang menjadi penyembuh tim, mampu menghidupkan rekan yang gugur dan menciptakan dinding es untuk menghambat musuh.", R.drawable.sage),
            Agent("Reyna", "Duelist dari Meksiko yang mendapatkan kekuatan dari musuh yang dia kalahkan, meningkatkan daya tempurnya di medan perang.", R.drawable.reyna),
            Agent("Raze", "Duelist dari Brasil dengan ledakan dahsyat, senjata-senjata inovatif, dan gaya bermain yang agresif.", R.drawable.raze),
            Agent("Killjoy", "Sentinel dari Jerman yang menggunakan teknologi canggih untuk mengendalikan area dan mengalahkan musuh dengan jebakan yang mematikan.", R.drawable.killjoy),
            Agent("Cypher", "Sentinel dari Maroko yang menjadi ahli intelijen dengan kamera dan jebakan untuk memata-matai pergerakan musuh.", R.drawable.cypher),
            Agent("Sova", "Initiator dari Rusia yang menggunakan panah pengintai dan drone untuk melacak posisi musuh di medan perang.", R.drawable.sova),
            Agent("Breach", "Initiator dari Swedia yang memiliki kemampuan menghancurkan pertahanan musuh dengan ledakan dan serangan area besar.", R.drawable.breach),
            Agent("Omen", "Controller misterius yang dapat menciptakan asap gelap, teleportasi singkat, dan membingungkan musuh dengan ilusi.", R.drawable.omen),
            Agent("Viper", "Controller dari Amerika Serikat yang menggunakan racun untuk mengontrol medan perang dan menghancurkan musuh secara perlahan.", R.drawable.viper),
            Agent("Brimstone", "Controller dari Amerika Serikat yang mendukung tim dengan serangan udara presisi dan granat asap untuk mengendalikan area.", R.drawable.brimstone),
            Agent("Astra", "Controller dari Ghana dengan kemampuan kosmik yang dapat menciptakan strategi kompleks untuk mengontrol area dan memanipulasi musuh.", R.drawable.astra),
            Agent("Skye", "Initiator dari Australia yang memimpin tim dengan kemampuan penyembuhan, pendeteksi musuh, dan kontrol area melalui makhluk-makhluk alam.", R.drawable.skye),
            Agent("Yoru", "Duelist dari Jepang yang menggunakan ilusi dan teleportasi untuk mengecoh musuh dan menyerang dari arah yang tak terduga.", R.drawable.yoru),
            Agent("Neon", "Duelist dari Filipina dengan kecepatan luar biasa, memanfaatkan listrik untuk menyerang musuh dan melintasi medan perang dengan cepat.", R.drawable.neon),
            Agent("KAY/O", "Initiator robot yang dapat menonaktifkan kemampuan musuh dan memimpin serangan agresif dengan persenjataan canggih.", R.drawable.kayo),
            Agent("Chamber", "Sentinel dari Prancis yang menggunakan senjata khusus untuk menyerang musuh dari jarak jauh dengan presisi tinggi.", R.drawable.chamber),
            Agent("Fade", "Initiator dari Turki yang mengendalikan kekuatan mimpi buruk untuk melacak dan membingungkan musuh di medan perang.", R.drawable.fade),
            Agent("Harbor", "Controller dari India yang menggunakan air untuk melindungi rekan setim dan mengontrol pergerakan musuh.", R.drawable.harbor),
            Agent("Deadlock", "Sentinel dari Norwegia yang menggunakan perangkat canggih untuk mengendalikan area dan menghalangi pergerakan musuh.", R.drawable.deadlock)
        )
    }

    fun getWeapons(): List<Weapon> {
        return listOf(
            Weapon("Vandal", "Senjata serbu dengan akurasi tinggi dan kerusakan besar, cocok untuk pertempuran jarak menengah hingga jauh.", R.drawable.vandal),
            Weapon("Phantom", "Senjata serbu dengan suara lebih senyap dan stabil untuk pertempuran jarak menengah.", R.drawable.phantom),
            Weapon("Bulldog", "Senjata serbu ekonomis dengan mode burst yang efektif pada jarak sedang.", R.drawable.bulldog),
            Weapon("Guardian", "Rifle semi-otomatis dengan akurasi tinggi untuk headshot presisi.", R.drawable.guardian),
            Weapon("Spectre", "SMG cepat dengan akurasi tinggi saat bergerak, ideal untuk jarak dekat.", R.drawable.spectre),
            Weapon("Stinger", "SMG dengan tembakan cepat untuk pertarungan jarak sangat dekat.", R.drawable.stinger),
            Weapon("Operator", "Senapan sniper dengan kerusakan sangat tinggi, mampu membunuh dengan satu tembakan.", R.drawable.operator),
            Weapon("Marshal", "Senapan sniper ekonomis dengan kerusakan besar tetapi kurang stabil dibandingkan Operator.", R.drawable.marshal),
            Weapon("Judge", "Senjata shotgun otomatis dengan tembakan cepat, efektif di jarak dekat.", R.drawable.judge),
            Weapon("Bucky", "Shotgun ekonomis dengan mode alternatif untuk serangan jarak menengah.", R.drawable.bucky),
            Weapon("Ghost", "Pistol dengan suara senyap dan akurasi tinggi, cocok untuk ronde pistol.", R.drawable.ghost),
            Weapon("Sheriff", "Pistol revolver dengan kerusakan sangat besar, mampu menembus armor.", R.drawable.sheriff),
            Weapon("Classic", "Pistol dasar yang ekonomis dengan mode burst untuk jarak dekat.", R.drawable.classic),
            Weapon("Frenzy", "Pistol otomatis dengan tembakan cepat untuk jarak sangat dekat.", R.drawable.frenzy),
            Weapon("Shorty", "Pistol shotgun kecil yang kuat di jarak sangat dekat.", R.drawable.shorty),
            Weapon("Ares", "Senjata mesin dengan kapasitas peluru besar dan tembakan stabil.", R.drawable.ares),
            Weapon("Odin", "Senjata mesin berat dengan daya tembak tinggi untuk mendominasi area.", R.drawable.odin)
        )
    }

    fun getMaps(): List<Map> {
        return listOf(
            Map("Haven", "Map unik dengan tiga spike sites, memberikan banyak opsi strategi bagi tim.", R.drawable.haven),
            Map("Bind", "Map dengan dua spike sites yang memiliki teleport unik untuk rotasi cepat.", R.drawable.bind),
            Map("Split", "Map dengan high-ground strategis dan jalur choke point sempit, cocok untuk taktik bertahan.", R.drawable.split),
            Map("Ascent", "Map dengan mekanik pintu yang dapat ditutup untuk menghalangi musuh.", R.drawable.ascent),
            Map("Icebox", "Map dengan banyak vertikalitas dan zipline untuk mobilitas tinggi.", R.drawable.icebox),
            Map("Breeze", "Map yang luas dengan garis tembak panjang, cocok untuk senjata jarak jauh.", R.drawable.breeze),
            Map("Fracture", "Map dengan jalur unik berbentuk X yang memungkinkan serangan dari berbagai arah.", R.drawable.fracture),
            Map("Pearl", "Map bawah laut yang dirancang dengan jalur sederhana, cocok untuk permainan yang seimbang.", R.drawable.pearl),
            Map("Lotus", "Map dengan tiga spike sites seperti Haven, tetapi dilengkapi pintu berputar untuk rotasi unik.", R.drawable.lotus),
            Map("Sunset", "Map baru dengan fokus pada kontrol mid, cocok untuk permainan taktis.", R.drawable.sunset)
        )
    }
}
