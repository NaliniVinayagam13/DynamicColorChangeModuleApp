# DynamicColorChangeModuleApp
Sample app to change the theme color and views color by adding an external module in the app - Java

Just download and extract the DynamicColorChange_Java module from here and add **"implementation project(':DynamicColorChange_Java')"** in your app level build.gradle file.
You can refer the usage of the module in the attached sample app. For example, to change the color of the imageview, you can use it as,

<com.example.dynamiccolorchange_java.widgets.CustomImageView
        android:id="@+id/img_sample"
        android:layout_gravity="center_horizontal"
        android:layout_margin="16dp"
        android:layout_width="150dp"
        android:layout_height="150dp"
        android:src="@drawable/ic_android_green_700_24dp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        />
by defining the CustomImageView from the specied path.  Validtaion for entering the color code in the edittext will be handled by,
<EditText
        android:id="@+id/etxtToolBarColr"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginLeft="10dp"
        android:layout_marginRight="10dp"
        android:maxLength="7"
        android:text="#"
        android:digits="0123456789#qwertyuioplkjhgfdsazxcvbnm"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/txt_theme_color"
        />
        
Thats it! Remaining you can find in Sample app itself.. Happy Coding..
