package com.kuliah.fahrulyurisnan.contohrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.kuliah.fahrulyurisnan.contohrecyclerview.adapter.ClickListener;
import com.kuliah.fahrulyurisnan.contohrecyclerview.adapter.MyDataAdapter;
import com.kuliah.fahrulyurisnan.contohrecyclerview.adapter.RecyclerTouchListener;
import com.kuliah.fahrulyurisnan.contohrecyclerview.models.MyData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;
//    private String[] mData;
    private List<MyData> myData = new ArrayList<>();
    private MyData data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.list);
        mLayoutManager = new GridLayoutManager(this,2);
        mRecyclerView.setLayoutManager(mLayoutManager);

        data = new MyData("Database", "Man With A Mission", "2014", R.drawable.mwam3,
                "[Intro]\n" +
                        "Counteraction rising\n" +
                        "Yeah we are ready for the punch line\n" +
                        "There's no use with all your gimmicks\n" +
                        "So check this out\n" +
                        "\n" +
                        "[Verse]\n" +
                        "Login you damned one's\n" +
                        "Crush the won't you compromise\n" +
                        "The noise comes we are ready to bow\n" +
                        "What about the antidote for the jammed and hypnotized\n" +
                        "Rend the lie that covers\n" +
                        "Who's the real sucker now\n" +
                        "\n" +
                        "Sakimidareta hana no you ni azayaka na itami daki\n" +
                        "Tatazumu machi o nukete mayoi no serifu wa sute\n" +
                        "Kaeranai koe yo hibike\n" +
                        "We say Wow Wow Wow Wow\n" +
                        "\n" +
                        "[Chorus]\n" +
                        "Database Database\n" +
                        "Just living in the Database Wow Wow\n" +
                        "The wall of pure fiction's cracking in my head\n" +
                        "And the addiction of my world still spreads\n" +
                        "\n" +
                        "In the Database Database\n" +
                        "I'm struggling in the Database Wow Wow\n" +
                        "It doesn't even matter if there is no hope\n" +
                        "As the madness of the system grows");
        myData.add(data);

        data = new MyData("Emotions", "Man With A Mission", "2015", R.drawable.mwam,
                "[Chorus]\n" +
                        "Without the light in dark\n" +
                        "But I feel the deepest emotions\n" +
                        "Throughout the fight with mind\n" +
                        "I don't care about the lapse\n" +
                        "\n" +
                        "Believe your voice and smiles\n" +
                        "I'll be going there with my motion\n" +
                        "Blow out the feeling dead\n" +
                        "I don't care about the past\n" +
                        "\n" +
                        "[Verse 1]\n" +
                        "Killing the emotion of mine and I just use my mind\n" +
                        "Forget my life\n" +
                        "Apathy, impassivity and indifference of all the cautions to my life\n" +
                        "\n" +
                        "You were alive and said\n" +
                        "We're the ones who changes the world we know by our hands\n" +
                        "You'd always saved, rescued and loved your neighbors as yourself\n" +
                        "\n" +
                        "[Pre-Chorus]\n" +
                        "Come and see just call my name\n" +
                        "Kodoku ni wakare wo te wo hiroge takaku sora e sakebu\n" +
                        "\n" +
                        "[Chorus]\n" +
                        "Without the light in dark\n" +
                        "But I feel the deepest emotions\n" +
                        "Throughout the fight with mind\n" +
                        "I don't care about the lapse\n");
        myData.add(data);

        data = new MyData("White World", "Man With A Mission", "2011", R.drawable.logomwam,"" +
                "[Verse 1]\n" +
                "Mado kara kobore ochiru hikari de\n" +
                "Yawarakaku me o samashi tsuitachi e\n" +
                "Itsumo no nichijo ni tobikonde\n" +
                "Mukishitsuna sekai ga surechigatte iku dake\n" +
                "Kanjo moteamasu dashi kata sae mo jibunde wa wakaranaku naru\n" +
                "Sagashi mono sagasu tabi ni kyo mo ippo o tada fumidasu\n" +
                "\n" +
                "Machi no zatto ni umorete ku kokoro\n" +
                "Juryoku ni sura makete shimai sona konogoro\n" +
                "Nanika o eru kawari ni\n" +
                "Nani o ushinau no ka to itsumo no jimonjito\n" +
                "Yugami makutta sekai o\n" +
                "Mukuna mama de susunde iku no wa kowaikedo\n" +
                "Matsu koto naku fumidasou, ashita kara nigezu ni aruite ikou to\n" +
                "\n" +
                "[Chorus]\n" +
                "Yeah, kono hoshi no ue de, umarete kuchi yuku\n" +
                "Soredemo itsuka doko ka de\n" +
                "Yeah, majiri au kiseki, shinjite misuete\n" +
                "Utsumukazu ni aruite ikou\n" +
                "\n" +
                "[Verse 2]\n" +
                "Kawaranai machinami ni kenki ga sashi\n" +
                "Kawatte shimai sona jibun ni wa iradachi\n" +
                "Bozen tachisukumu munashi sa no aji o mata kamikoroshite iku\n" +
                "Mujun darake to sake teta sekai ni itsunomanika najin jatta no kamo\n" +
                "\n" +
                "Nanigenaku tachidomatte haiiro no biru-gun kotoba mo naku mitsumeru\n" +
                "Hontoni daijina no wa nanidesu ka?\n" +
                "Gimon bakari nagekake atte iru jidai o\n" +
                "Nagare iku jikan to ashinami o soroezu ni mewotojite miyou yo\n" +
                "\n" +
                "Shinkokyu hitotsu shite so, kokoro no koe ni sotto mimi katamukete\n" +
                "Bokura ga kizanda ashiato kesshite machigai nanka janaito\n" +
                "Anogoro wa itsumo tewonobasu dakede i nda yo\n" +
                "Jiyu ni tobu koto ga dekiru to, honki de omo~tsu tetakedo\n" +
                "\n" +
                "Wakan'naku natte shimai-sona toki mo kawaranai shinjitsu wa aru yo\n" +
                "Hane nado hayasazutomo bokura wa kono ashi de aruite ikeru to\n" +
                "\n" +
                "[Chorus]\n" +
                "Yeah, kono hoshi no ue de, umarete kuchi yuku\n" +
                "Soredemo itsuka doko ka de\n" +
                "Yeah, majiri au kiseki, shinjite misuete\n" +
                "Utsumukazu ni aruite ikou\n" +
                "\n" +
                "[Break]\n" +
                "\n" +
                "[Bridge]\n" +
                "Shinkokyu hitotsu shite so\n" +
                "Kokoro no koe ni sotto mimi katamukete\n" +
                "Matsu koto naku fumidasou ashita kara nigezu ni aruite ikou to\n" +
                "\n" +
                "Ima wa\n" +
                "\n" +
                "[Chorus]\n" +
                "Yeah, kono hoshi no ue de, umarete kuchi yuku\n" +
                "Soredemo itsuka doko ka de\n" +
                "Yeah, majiri au kiseki, shinjite misuete\n" +
                "Utsumukazu ni aruite ikou");
        myData.add(data);

        data = new MyData("Don't Lose Yourself", "Man With A Mission", "2011", R.drawable.mwam1,
                "[Verse 1]\n" +
                        "Pop goes the weasel we're bored to death without a doubt\n" +
                        "Let go the reason and find out what's it all about you know I want out\n" +
                        "We're pissed with all the shit you know I want out\n" +
                        "\n" +
                        "Look at the people hey all they do is live and flout\n" +
                        "Crap of the year come on let's just hear your coming out you know I want out\n" +
                        "I'm pissed with all the shit come on I want out\n" +
                        "\n" +
                        "[Bridge]\n" +
                        "Yuugen, mugen wo iikikasete mo\n" +
                        "Shosen, muen na kono sekai\n" +
                        "Kinou fuzen ni ochiiru nonara\n" +
                        "Te ni irete kirikuzuse\n" +
                        "\n" +
                        "[Chorus]\n" +
                        "Hey boy, don't lose yourself\n" +
                        "You can't trust someone else\n" +
                        "Hey boy, don't lose yourself\n" +
                        "You need to help yourself\n" +
                        "Come in, come in, come in, come in\n" +
                        "\n" +
                        "Hey boy, don't lose yourself\n" +
                        "You can't trust someone else\n" +
                        "Hey boy, don't lose yourself\n" +
                        "You need to help yourself\n" +
                        "Come in, come in, come in, come in\n" +
                        "\n" +
                        "[Verse 2]\n" +
                        "Let in the rhythm and music, everybody shout\n" +
                        "Brush up your mind and go choose it, take me somewhere out\n" +
                        "You know I want out\n" +
                        "I'm pissed with all the shit you know I want out\n" +
                        "\n" +
                        "[Bridge]\n" +
                        "Yuushou, mushou wo toitadashite mo\n" +
                        "Shogyoumujou no kono sekai\n" +
                        "Chikai mirai wo ureu nonara\n" +
                        "Te wo awase inori utae\n" +
                        "\n" +
                        "[Chorus]\n" +
                        "Hey boy, don't lose yourself\n" +
                        "You can't trust someone else\n" +
                        "Hey boy, don't lose yourself\n" +
                        "You need to help yourself\n" +
                        "Come in, come in, come in, come in\n" +
                        "\n" +
                        "Hey boy, don't lose yourself\n" +
                        "You can't trust someone else\n" +
                        "Hey boy, don't lose yourself\n" +
                        "You need to help yourself\n" +
                        "Come in, come in, come in, come in\n" +
                        "\n" +
                        "[Bridge]\n" +
                        "Wake up and trust what you feel\n" +
                        "Wake up and know what's the deal\n" +
                        "Wake up and trust what you feel\n" +
                        "Wake up and know what's the deal\n" +
                        "\n" +
                        "You know, look at the world hey all they do is live and flout\n" +
                        "Crap of the year come on let's just hear your coming out\n" +
                        "You know I want out\n" +
                        "I'm pissed with all the shit\n" +
                        "Yeah !\n" +
                        "\n" +
                        "[Chorus]\n" +
                        "Hey boy, don't lose yourself\n" +
                        "You can't trust someone else\n" +
                        "Hey boy, don't lose yourself\n" +
                        "You need to help yourself\n" +
                        "Come in, come in, come in, come in\n" +
                        "\n" +
                        "Hey boy, don't lose yourself\n" +
                        "You can't trust someone else\n" +
                        "Hey boy, don't lose yourself\n" +
                        "You need to help yourself\n" +
                        "Come in, come in, come in, come in");
        myData.add(data);

        data = new MyData("Insane Dream", "Aimer", "2016",
                R.drawable.insane_dream1, "ZONK");
        myData.add(data);

        data = new MyData("Us", "Aimer", "2016", R.drawable.insane_dream1, "bla bla bla...");
        myData.add(data);

        data = new MyData("Tone", "Aimer", "2016", R.drawable.insane_dream_2, "bla bla bla...");
        myData.add(data);

        data = new MyData("Butterfly Knot", "Aimer", "2016",
                R.drawable.chouchou1, "bla bla bla...");
        myData.add(data);

        data = new MyData("Think of You in Summer Grass", "Aimer", "2016",
                R.drawable.chouchou2, "bla bla bla...");
        myData.add(data);

        data = new MyData("September", "Aimer", "2016", R.drawable.chouchou1, "bla bla bla...");
        myData.add(data);

        data = new MyData("Kagoesou na Kisetsu Kara", "Aimer", "2017", R.drawable.spica1, "bla bla bla...");
        myData.add(data);

        data = new MyData("Re:Pray", "Aimer", "2017", R.drawable.spica2, "ZONK");
        myData.add(data);

        data = new MyData("broKen NIGHT", "Aimer", "2017", R.drawable.hoshikuzu_venus_1, "bla bla bla...");
        myData.add(data);

        data = new MyData("Everlasting Snow", "Aimer", "2017", R.drawable.hoshikuzu_venus_1, "bla bla bla...");
        myData.add(data);

        data = new MyData("March of Time", "Aimer", "2017", R.drawable.spica2, "bla bla bla...");
        myData.add(data);

        data = new MyData("Sixth Star Night", "Aimer", "2017", R.drawable.spica2, "bla bla bla...");
        myData.add(data);

        data = new MyData("stardust venus", "Aimer", "2012", R.drawable.hoshikuzu_venus_1, "bla bla bla...");
        myData.add(data);

        data = new MyData("Polaris", "Aimer", "2014", R.drawable.spica2, "COBA LAGI");
        myData.add(data);

        data = new MyData("Kataomoi", "Aimer", "2016", R.drawable.spica2, "bla bla bla...");
        myData.add(data);

        mAdapter = new MyDataAdapter(myData);
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.addOnItemTouchListener((new RecyclerTouchListener(getApplicationContext(),
                mRecyclerView, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                MyData data = myData.get(position);
                Intent i = new Intent(getApplicationContext(), DetailActivity.class);
                i.putExtra("judul", data.getJudul());
                i.putExtra("nama", data.getNama());
                i.putExtra("lirik", data.getLirik());
                startActivity(i);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        })));

    }
}
