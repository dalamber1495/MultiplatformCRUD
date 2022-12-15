//
//  NoteListViewModel.swift
//  iosApp
//
//  Created by developer on 15.12.2022.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation
import shared

extension NoteListScreen{
    @MainActor class NoteListViewModel: ObservableObject{
        private var noteDataSource: NoteDataSource? = nil
        
        init(noteDataSource: NoteDataSource? = nil){
            self.noteDataSource = noteDataSource
        }
    }
}
