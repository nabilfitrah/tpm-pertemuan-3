package www.nabil.tugastiga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model> main_list;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_list=new ArrayList<>();
        recyclerView = findViewById(R.id.activitymain_recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        main_list.add(new Model(R.drawable.ahmad_dahlan,"Ahmad Dahlan", "Salah seorang ulama dan khatib terkemuka di Masjid Besar Kasultanan Yogyakarta pada masa itu, dan ibu dari K.H. Ahmad Dahlan adalah puteri dari H. Ibrahim"));
        main_list.add(new Model(R.drawable.ahmad_yani,"Ahmad Yani", "Jenderal TNI Anumerta Ahmad Yani (juga dieja Achmad Yani; lahir di Purworejo, Jawa Tengah, 19 Juni 1922 – meninggal di Lubang Buaya"));
        main_list.add(new Model(R.drawable.bung_tomo,"Bung Tomo", "Sutomo (lahir di Surabaya, Jawa Timur, 3 Oktober 1920 – meninggal di Padang Arafah, Arab Saudi, 7 Oktober 1981 pada umur 61 tahun) lebih dikenal dengan sapaan akrab oleh rakyat sebagai Bung Tomo"));
        main_list.add(new Model(R.drawable.gatot_subroto,"Gatot Subroto", "Jenderal TNI (Purn.) Gatot Soebroto (lahir di Sumpiuh, Banyumas, Jawa Tengah, 10 Oktober 1907 – meninggal di Jakarta, 11 Juni 1962 pada umur 54 tahun) adalah tokoh perjuangan militer Indonesia"));
        main_list.add(new Model(R.drawable.ki_hadjar_dewantara,"Ki Hajar Dewantara", "Raden Mas Soewardi Soerjaningrat (EBI: Suwardi Suryaningrat, sejak 1922 menjadi Ki Hadjar Dewantara, EBI: Ki Hajar Dewantara, beberapa menuliskan bunyi bahasa Jawanya dengan Ki Hajar Dewantoro; lahir di Pakualaman, 2 Mei 1889"));
        main_list.add(new Model(R.drawable.mohammad_hatta,"Mohammad Hatta", "Dr.(HC) Drs. H. Mohammad Hatta (lahir dengan nama Mohammad Athar, dikenal sebagai Bung Hatta; lahir di Fort de Kock (sekarang Bukittinggi, Sumatera Barat), Hindia Belanda, 12 Agustus 1902"));
        main_list.add(new Model(R.drawable.sudirman,"Soedirman", "Jenderal Besar Raden Soedirman (EYD: Sudirman; lahir 24 Januari 1916 – meninggal 29 Januari 1950 pada umur 34 tahun) adalah seorang perwira tinggi Indonesia pada masa Revolusi"));
        main_list.add(new Model(R.drawable.sukarno,"Soekarno", "Dr.(H.C.) Ir. H. Soekarno (ER, EYD: Sukarno, nama lahir: Koesno Sosrodihardjo) (lahir di Surabaya, Jawa Timur, 6 Juni 1901 – meninggal di Jakarta, 21 Juni 1970 pada umur 69 tahun)"));
        main_list.add(new Model(R.drawable.supomo,"Soepomo", "Prof. Mr. Dr. Soepomo (Ejaan Soewandi: Supomo; lahir di Sukoharjo, Jawa Tengah, 22 Januari 1903 – meninggal di Jakarta, 12 September 1958 pada umur 55 tahun) adalah seorang pahlawan nasional Indonesia"));
        main_list.add(new Model(R.drawable.tan_malaka,"Tan Malaka", "Tan Malaka atau Ibrahim gelar Datuk Sutan Malaka (lahir di Nagari Pandam Gadang, Suliki, Lima Puluh Kota, Sumatera Barat, 2 Juni 1897 – meninggal di Desa Selopanggung, Kediri, Jawa Timur"));
        adapter = new CustomAdapter(main_list,getApplicationContext());
        recyclerView.setAdapter(adapter);
    }

}
