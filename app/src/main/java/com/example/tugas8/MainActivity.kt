package com.example.tugas8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.crycelview_list.adapter.ListAdapter
import com.example.tugas8.databinding.ActivityMainBinding
import com.example.tugas8.model.DataList

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private lateinit var listadapter: ListAdapter
    private val dataDummy = arrayListOf(
        DataList(
            R.drawable.asamjawa,
            "Asam Jawa",
            "Asam jawa adalah sejenis buah yang masam rasanya; sekaligus juga nama pohon penghasilnya yang masih termasuk famili Fabaceae. Spesies ini adalah satu-satunya anggota genus Tamarindus. Nama lain asam jawa adalah asam, asem jawa asem, kamal, accem, asang jawa, asang jawi dan lain-lain. Juga sampalok, kalamagi, magyee, ma-kham, khaam, khoua me, me, trai me, dan tamarind. Buah yang telah tua, sangat masak dan dikeringkan biasa disebut asem kawak.",
            4.8),
        DataList(
            R.drawable.cengkeh,
            "Cengkeh",
            "Cengkih atau cengkeh adalah kuncup bunga kering beraroma dari keluarga pohon Myrtaceae. Cengkih adalah tanaman asli Indonesia, banyak digunakan sebagai bumbu masakan pedas di negara-negara Eropa, dan sebagai bahan utama rokok kretek khas Indonesia. Cengkih ditanam terutama di Indonesia dan Madagaskar; selain itu juga dibudidayakan di Zanzibar, India, dan Sri Lanka. Cengkih umumnya memiliki musim panen yang bervariasi di negara-negara penghasilnya. Tumbuhan ini adalah flora identitas Provinsi Maluku Utara.",
            4.8),
        DataList(
            R.drawable.jahe,
            "Jahe",
            "Jahe, adalah tumbuhan yang rimpangnya sering digunakan sebagai rempah-rempah dan bahan baku pengobatan tradisional. Rimpangnya berbentuk jemari yang menggembung di ruas-ruas tengah. Rasa dominan pedas yang dirasakan dari jahe disebabkan oleh senyawa keton bernama zingeron.",
            4.8),
        DataList(
            R.drawable.kayumanis,
            "Kayu Manis",
            "Kayu manis adalah tumbuhan dengan genus Cinnamomum dan famili Lauraceae yang digunakan sebagai penghasil rempah-rempah. Rempah ini memiliki aroma yang kuat, bersifat hangat, dan rasa yang manis. Bagian kayu manis yang dapat dimanfaatkan adalah kulit kayu bagian dalam yang dipotong dengan ketebalan tertentu atau dalam bentuk bubuk kayu manis.",
            4.8),
        DataList(
            R.drawable.kemiri,
            "Kemiri",
            "Kemiri, adalah tumbuhan yang bijinya dimanfaatkan sebagai sumber minyak dan rempah-rempah. Tumbuhan ini masih sekerabat dengan singkong dan termasuk dalam suku Euphorbiaceae. Dalam perdagangan antarnegara dikenal sebagai candleberry, Indian walnut, serta candlenut. Pohonnya disebut sebagai varnish tree atau kukui nut tree. Minyak yang diekstrak dari bijinya berguna dalam industri untuk digunakan sebagai bahan campuran cat.",
            4.8),
        DataList(
            R.drawable.kencur,
            "Kencur",
            "Kencur atau cekur (Kaempferia galanga) adalah tanaman yang mempunyai akar batang yang tertanam di dalam tanah, biasa dipakai untuk bahan rempah-rempah dan ramuan obat; Bagian tanaman kencur yang sering digunakan adalah rimpang, akar dan daun.",
            4.8),
        DataList(
            R.drawable.ketumbar,
            "Ketumbar",
            "Ketumbar adalah tumbuhan rempah-rempah yang populer. Buahnya yang kecil dikeringkan dan diperdagangkan, baik digerus maupun tidak. Bentuk yang tidak digerus mirip dengan lada, seperti biji kecil-kecil berdiameter 1-2 mm. Ketumbar mempunyai aroma yang khas. Aroma ini disebabkan oleh komponen kimia yang terdapat dalam minyak atsiri ketumbar. Komponen utama minyak atsir ketumbar adalah linalool, dengan komponen pendukung lainnya seperti geraniol, geranil asetat dan camphor",
            4.8),
        DataList(
            R.drawable.kunyit,
            "Kunyit",
            "Kunyit atau kunir,, adalah termasuk salah satu tanaman rempah-rempah dan obat asli dari wilayah Asia Tenggara. Tanaman ini kemudian mengalami penyebaran ke daerah Malaysia, Indonesia, Australia bahkan Afrika. Hampir setiap orang Indonesia dan India serta bangsa Asia umumnya pernah mengonsumsi tanaman rempah ini, baik sebagai pelengkap bumbu masakan, jamu atau obat untuk menjaga kesehatan dan kecantikan seperti pemakaian dalam perawatan kulit dan wajah.",
            4.8),
        DataList(
            R.drawable.lengkuas,
            "Lengkuas",
            "Lengkuas, laos atau kelawas merupakan jenis tumbuhan umbi-umbian yang bisa hidup di daerah dataran tinggi maupun dataran rendah. Lengkuas adalah salah satu jenis rempah-rempah yang banyak ditanam di Asia, seperti India, Arab, Cina, Sri Lanka, dan Indonesia. Umumnya masyarakat memanfaatkannya sebagai campuran bumbu masak dan pengobatan tradisional. Pemanfaatan lengkuas untuk masakan dengan cara mememarkan rimpang kemudian dicelupkan begitu saja ke dalam campuran masakan, sedangkan untuk pengobata",
            4.8),
        DataList(
            R.drawable.serai,
            "Serai",
            "Sereh wangi tumbuh berumpun dan memiliki akar serabut dengan jumlah yang cukup banyak. Daun sereh wangi berbentuk pipih melengkung dan memanjang seperti rumput-rumputan dengan panjang mencapai 1 meter dan lebar pada kisaran 1 cm hingga 2 cm. Daun sereh wangi terlihat hijau hingga hijau kebiruan dengan batang berwarna hijau hingga merah keunguan. Bila diremas, daun sereh akan mengeluarkan aroma khas serai wangi",
            4.8),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        listadapter = ListAdapter(this)
        binding.rvList.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = listadapter
        }
        listadapter.setData(dataDummy)
    }

}