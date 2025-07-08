package com.application.composenoteapp.core.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.application.composenoteapp.add_note.presentation.AddNoteScreen
import com.application.composenoteapp.core.presentation.ui.theme.ComposeNoteAppTheme
import com.application.composenoteapp.note_list.presentation.NoteListScreen
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeNoteAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    ) {
                        Navigation()
                    }
                }
            }
        }
    }
}

@Composable
fun Navigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = Screen.NoteList
    ) {

        composable<Screen.NoteList> {
            NoteListScreen(
                onNavigateToAddNote = {
                    navController.navigate(Screen.AddNote)
                }
            )
        }

        composable<Screen.AddNote> {
            AddNoteScreen(
                onSave = {
                    navController.popBackStack()
                }
            )
        }
    }
}
