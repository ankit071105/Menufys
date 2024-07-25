package com.example.menufy


import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import com.example.menufy.databinding.ActivityLocationscreenBinding

class locationscreen : AppCompatActivity() {
    private lateinit var binding: ActivityLocationscreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLocationscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val lsit = arrayOf(
            "Mumbai", "Delhi", "Bengaluru", "Hyderabad", "Ahmedabad", "Chennai", "Kolkata",
            "Surat", "Pune", "Jaipur", "Lucknow", "Kanpur", "Nagpur", "Indore", "Thane",
            "Bhopal", "Visakhapatnam", "Pimpri-Chinchwad", "Patna", "Vadodara", "Ghaziabad",
            "Ludhiana", "Agra", "Nashik", "Faridabad", "Meerut", "Rajkot", "Kalyan-Dombivli",
            "Vasai-Virar", "Varanasi", "Srinagar", "Aurangabad", "Dhanbad", "Amritsar",
            "Navi Mumbai", "Allahabad", "Ranchi", "Howrah", "Coimbatore", "Jabalpur", "Gwalior",
            "Vijayawada", "Jodhpur", "Madurai", "Raipur", "Kota", "Chandigarh", "Guwahati",
            "Solapur", "Hubli-Dharwad", "Mysore", "Tiruchirappalli", "Bareilly", "Aligarh",
            "Tiruppur", "Moradabad", "Jalandhar", "Bhubaneswar", "Salem", "Warangal",
            "Mira-Bhayandar", "Thiruvananthapuram", "Bhiwandi", "Saharanpur", "Guntur",
            "Amravati", "Bikaner", "Noida", "Jamshedpur", "Bhilai", "Cuttack", "Firozabad",
            "Kochi", "Nellore", "Bhavnagar", "Dehradun", "Durgapur", "Asansol", "Rourkela",
            "Nanded", "Kolhapur", "Ajmer", "Akola", "Gulbarga", "Jamnagar", "Ujjain", "Loni",
            "Siliguri", "Jhansi", "Ulhasnagar", "Mangalore", "Erode", "Belgaum", "Ambattur",
            "Tirunelveli", "Malegaon", "Gaya", "Jalgaon", "Udaipur", "Maheshtala", "Davanagere",
            "Kozhikode", "Kurnool", "Rajpur Sonarpur", "Bokaro", "South Dumdum", "Bellary",
            "Patiala", "Gopalpur", "Agartala", "Bhagalpur", "Muzaffarnagar", "Bhatpara",
            "Panihati", "Latur", "Dhule", "Rohtak", "Korba", "Bhilwara", "Brahmapur",
            "Muzaffarpur", "Ahmednagar", "Mathura", "Kollam", "Avadi", "Kadapa", "Anantapur",
            "Kamarhati", "Bilaspur", "Sambalpur", "Shahjahanpur", "Satara", "Bijapur", "Rampur",
            "Shimoga", "Chandrapur", "Junagadh", "Thrissur", "Alwar", "Bardhaman", "Kulti",
            "Kakinada", "Nizamabad", "Parbhani", "Tumkur", "Hisar", "Ozhukarai", "Bihar Sharif",
            "Panipat", "Darbhanga", "Bally", "Aizawl", "Dewas", "Ichalkaranji", "Karnal",
            "Bathinda", "Jalna", "Eluru", "Barasat", "Kirari Suleman Nagar", "Purnia", "Satna",
            "Mau", "Sonipat", "Farrukhabad", "Sagar", "Imphal", "Ratlam", "Hapur", "Arrah",
            "Karimnagar", "Etawah", "Ambarnath", "North Dumdum", "Bharatpur", "Begusarai",
            "New Delhi", "Chhapra", "Ramagundam", "Bharuch", "Baranagar", "Pali", "Vizianagaram",
            "Katihar", "Haridwar", "Sri Ganganagar", "Karawal Nagar", "Nagercoil", "Mango",
            "Thanjavur", "Bulandshahr", "Uluberia", "Katni", "Sambhal", "Singrauli", "Nadiad",
            "Secunderabad", "Naihati", "Yamunanagar", "Bidhannagar", "Pallavaram", "Bidar",
            "Munger", "Panchkula", "Burhanpur", "Raurkela Industrial Township", "Kharagpur",
            "Dindigul", "Gandhidham", "Hospet", "Nangloi Jat", "Malda", "Ongole", "Deoghar",
            "Chapra", "Haldia", "Khandwa", "Nandyal", "Morena", "Amroha", "Anand", "Bhind",
            "Bhalswa Jahangir Pur", "Madhyamgram", "Bhiwani", "Berhampur", "Ambala", "Morbi",
            "Fatehpur", "Raebareli", "Khora, Ghaziabad", "Chittoor", "Bhusawal", "Orai",
            "Bahraich", "Sikar", "Vellore", "Mehsana", "Raiganj", "Serampore", "Etah",
            "Diamond Harbour", "Vapi", "Mahesana", "Baramati", "Guntakal", "Shivpuri",
            "Gurdaspur", "Unnao", "Palghat", "Shrirampur", "Haldwani-cum-Kathgodam",
            "Chhindwara", "Dharmavaram", "Madhubani", "Rajnandgaon", "Jind", "Hoshangabad",
            "Yavatmal", "Palakkad", "Dehri", "Hassan", "Haveri", "Bagalkot", "Mandya",
            "Kanchrapara", "Makrana", "Silchar", "Tezpur", "Barmer", "Narsinghpur", "Rohtas",
            "Gonda", "Hazaribag", "Navsari", "Khammam", "Kasganj", "Basirhat", "Gobindgarh",
            "Mandla", "Palakkad"
        )

        val sortedCities = lsit.sortedArray()
        val adapter:ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, sortedCities)
        val autoCompleteTextView =binding.mylist
        autoCompleteTextView.setAdapter(adapter)
    }
}
